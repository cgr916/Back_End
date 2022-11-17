package _2_validIPAddress_;

/**
 * @author: cgr
 * @date: 2022/9/14 - 21:52
 */


/*  ip地址是否合理  1.1.1.1  ===>>   true
*   思路：根据 . : 来确定类型，分类进行处理
*   indexOf
*
* */
public class ValidIPAddress {
    public static void main(String[] args) {
        String s = "172:16:254:1:";
        String[] strs = s.split(":");
        for (String s1 : s.split(":")) {
            System.out.println(s1+'-');
        }
        System.out.println(strs.length);
//        System.out.println(s.indexOf(":",3));
//        System.out.println(s.indexOf(":",4));
    }

    public String validIPAddress(String queryIP) {
        if(queryIP.indexOf('.')>0){
            String[] strings = queryIP.split(".");
            int length = strings.length;
            if(length!=4) return "Neither";
            else {
                for (int i=0;i<length;++i){
                    if(strings[i].charAt(0)=='0') return "Neither";
                    int len = strings[i].length(),sum=0;
                    for (int j=0;j<len;++j){
                        if(Character.isDigit(strings[i].charAt(j))){
                            sum=sum*10+(strings[i].charAt(j)-'0');
                        }else return "Neither";
                    }
                    if(sum>255) return "Neither";
                }
            }
            return "IPv4";
        }else if(queryIP.indexOf(':')>0){
            String[] strings = queryIP.split(":");
            int length = strings.length;
            if(length!=8) return "Neither";
            else {
                for (int i=0;i<length;++i){
                    if(strings[i].charAt(0)=='0') return "Neither";
                    if(strings[i].length()>4||strings[i].length()<1) return "Neither";
                    int len = strings[i].length();
                    for (int j=0;j<len;++j){
                        if(!(Character.isDigit(strings[i].charAt(j)) || (strings[i].charAt(j)>='a'&&strings[i].length()<='f'))){
                            return "Neither";
                        }
                    }
                }
            }
            return "IPv6";
        }else return "Neither";
    }

}
