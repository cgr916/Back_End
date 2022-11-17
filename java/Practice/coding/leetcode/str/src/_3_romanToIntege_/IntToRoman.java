package _3_romanToIntege_;

/**
 * @author: cgr
 * @date: 2022/10/5 - 9:41
 */
public class IntToRoman {
    public static void main(String[] args) {

    }

    public String intToRoman(int num) {
        int divide = 1000;
        StringBuilder builder = new StringBuilder();
        while (divide >= 1){
            int m = num / divide;
            switch (divide){
                case 1:
                    if(m==9){
                        builder.append("IX");
                        num-=9;
                    }else if(m>=5){
                        builder.append("V");
                        num-=5;
                        for(int i = 0;i<m-5;++i){
                            builder.append("I");
                            num-=1;
                        }
                    }else if(m==4){
                        builder.append("IV");
                        num-=4;
                    }else {
                        for (int i = 0;i<m;++i){
                            builder.append("I");
                            num-=1;
                        }
                    }
                    break;
                case 10:
                    if(m==9){
                        builder.append("XC");
                        num-=90;
                    }else if(m>=5){
                        builder.append("L");
                        num-=50;
                        for(int i = 0;i<m-5;++i){
                            builder.append("X");
                            num-=10;
                        }
                    }else if(m==4){
                        builder.append("XL");
                        num-=40;
                    }else {
                        for (int i = 0;i<m;++i){
                            builder.append("X");
                            num-=10;
                        }
                    }
                    break;
                case 100:
                    if(m==9){
                        builder.append("CM");
                        num-=900;
                    }else if(m>=5){
                        builder.append("D");
                        num-=500;
                        for(int i = 0;i<m-5;++i){
                            builder.append("C");
                            num-=100;
                        }
                    }else if(m==4){
                        builder.append("CD");
                        num-=400;
                    }else {
                        for (int i = 0;i<m;++i){
                            builder.append("C");
                            num-=100;
                        }
                    }
                    break;
                case 1000:
                    for (int i = 0;i<m;++i){
                        builder.append('M');
                        num-=1000;
                    }
                    break;
            }
            divide/=10;
        }
        return builder.toString();
    }
}
