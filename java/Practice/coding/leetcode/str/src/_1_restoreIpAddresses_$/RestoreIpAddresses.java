package _1_restoreIpAddresses_$;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/2 - 15:18
 */

// medium

/* 根据字符串复原ip地址  ==>>  "25525511135"    ["255.255.11.135","255.255.111.35"]
*   思路：递归  用四个数组来存储对应的数字，当数组存满时，符合条件的进行写入
*   1、满4个，且到达尾部
*   2、无法满4个，先到达尾部
*   3、前导零，直接当0存储；
*   4、其他数存储需满足0<x<256,意味=0或>=256时不需要再循环执行
* */
public class RestoreIpAddresses {
    final int SEG_NUM = 4;
    public List<String> list = new ArrayList<>();
    public int[] segment = new int[SEG_NUM];
    public static void main(String[] args) {

    }

    public List<String> restoreIpAddresses(String s) {
        dfs(s,s.length(),0,0);
        return list;
    }

    public void  dfs(String s,int len,int begin,int seg){
        if(seg==SEG_NUM){
            if(begin==len){
                StringBuffer buffer = new StringBuffer();
                for(int i = 0;i<SEG_NUM;++i){
                    buffer.append(segment[i]);
                    if(i!=3) buffer.append(".");
                }
                list.add(buffer.toString());
            }
            return;
        }

        if(begin==len){
            return;
        }
        // 前导零的处理比较好
        if(s.charAt(begin)=='0'){
            segment[seg] = 0;
            dfs(s,len,begin+1,seg+1);
        }
        int addr = 0;
        for (int i = begin; i < len; ++i) {
            addr = addr*10+(s.charAt(i)-'0');
            if (addr>0&&addr<=0xff){
                segment[seg] = addr;
                dfs(s,len,i+1,seg+1);
            }else break;
        }
    }
}
