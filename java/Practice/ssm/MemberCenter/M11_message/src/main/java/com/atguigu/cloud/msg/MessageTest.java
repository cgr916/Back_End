package com.atguigu.cloud.msg;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Encoder;


/**
 * @author: cgr
 * @date: 2022/8/6 - 8:03
 */
public class MessageTest {
        public static String calcAuthorization(String source, String secretId, String secretKey, String datetime)
                throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
            String signStr = "x-date: " + datetime + "\n" + "x-source: " + source;
            Mac mac = Mac.getInstance("HmacSHA1");
            Key sKey = new SecretKeySpec(secretKey.getBytes("UTF-8"), mac.getAlgorithm());
            mac.init(sKey);
            byte[] hash = mac.doFinal(signStr.getBytes("UTF-8"));
            String sig = new BASE64Encoder().encode(hash);

            String auth = "hmac id=\"" + secretId + "\", algorithm=\"hmac-sha1\", headers=\"x-date x-source\", signature=\"" + sig + "\"";
            return auth;
        }

        public static String urlencode(Map<?, ?> map) throws UnsupportedEncodingException {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(String.format("%s=%s",
                        URLEncoder.encode(entry.getKey().toString(), "UTF-8"),
                        URLEncoder.encode(entry.getValue().toString(), "UTF-8")
                ));
            }
            return sb.toString();
        }

        public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
            //云市场分配的密钥Id
            String secretId = "AKIDAhpobum8JDy907cdAu2JQVK0n6FGA6sPgBvg";
            //云市场分配的密钥Key
            String secretKey = "32frd87KnTDRKVRnK1OImxd74MPvF5OW5wKg254";
            String source = "market";

            Calendar cd = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
            String datetime = sdf.format(cd.getTime());
            // 签名
            String auth = calcAuthorization(source, secretId, secretKey, datetime);
            // 请求方法
            String method = "POST";
            // 请求头
            Map<String, String> headers = new HashMap<String, String>();
            headers.put("X-Source", source);
            headers.put("X-Date", datetime);
            headers.put("Authorization", auth);

            // 查询参数
            Map<String, String> queryParams = new HashMap<String, String>();

            // body参数
            Map<String, String> bodyParams = new HashMap<String, String>();
            bodyParams.put("mobile","15898518521");
            bodyParams.put("tag","654321");
            bodyParams.put("templateId","MF3E78EFB8");
            // url参数拼接
            String url = "https://service-5ipqbocr-1308811306.sh.apigw.tencentcs.com/release/sms/send";
            if (!queryParams.isEmpty()) {
                url += "?" + urlencode(queryParams);
            }

            BufferedReader in = null;
            try {
                URL realUrl = new URL(url);
                HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
                conn.setConnectTimeout(5000);
                conn.setReadTimeout(5000);
                conn.setRequestMethod(method);

                // request headers
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    conn.setRequestProperty(entry.getKey(), entry.getValue());
                }

                // request body
                Map<String, Boolean> methods = new HashMap<>();
                methods.put("POST", true);
                methods.put("PUT", true);
                methods.put("PATCH", true);
                Boolean hasBody = methods.get(method);
                if (hasBody != null) {
                    conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

                    conn.setDoOutput(true);
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    out.writeBytes(urlencode(bodyParams));
                    out.flush();
                    out.close();
                }

                // 定义 BufferedReader输入流来读取URL的响应
                in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                String result = "";
                while ((line = in.readLine()) != null) {
                    result += line;
                }

                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();
            } finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
}
