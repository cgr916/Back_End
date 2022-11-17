package _2_combine_t;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/10/5 - 10:08
 */
public class LetterCombinations {
    List<String> list = new ArrayList<>();
    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return list;
        helper(new StringBuilder(),digits,0);
        return list;
    }

    public void helper(StringBuilder builder, String digits,int pos) {
        if (builder.length() == digits.length()) {
            list.add(new String(builder));
            return;
        }
        switch (digits.charAt(pos)){
            case 2:
                builder.append("a");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("b");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("c");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                break;
            case 3:
                builder.append("d");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("e");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("f");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                break;
            case 4:
                builder.append("g");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("h");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("i");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                break;
            case 5:
                builder.append("j");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("k");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("l");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                break;
            case 6:
                builder.append("m");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("n");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("o");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                break;
            case 7:
                builder.append("p");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("q");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("r");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("s");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                break;
            case 8:
                builder.append("t");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("u");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("v");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                break;
            case 9:
                builder.append("w");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("x");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("y");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                builder.append("z");
                helper(builder,digits,pos+1);
                builder.deleteCharAt(builder.length() - 1);
                break;
        }

    }
}
