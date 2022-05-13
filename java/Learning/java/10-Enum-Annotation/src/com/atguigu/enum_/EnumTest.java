package com.atguigu.enum_;

/**
 * @author: cgr
 * @date: 2022/4/10 - 16:22
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Week.valueOf("SUNDAY"));
        System.out.println(Week.SUNDAY.toString());
        Week[] values = Week.values();
        for (int i = 0;i<values.length;i++){
            System.out.println(values[i]);
        }
    }

}
enum Week{
    SUNDAY("周日"),
    MONDAY("周一");

    private final String desc;

    Week(String s) {
        this.desc = s;
    }
}

class Seanson {
    private final String SEASON_NAME;
    private final String SEASON_DESC;

    private Seanson(String name,String desc) {
        this.SEASON_DESC = desc;
        this.SEASON_NAME = name;
    }

    public static final Seanson SPRING = new Seanson("春天", "春暖花开");
    public static final Seanson SUMMER = new Seanson("夏天", "夏日炎炎");
    public static final Seanson AUTUMN = new Seanson("秋天", "秋高气爽");
    public static final Seanson WINTER = new Seanson("冬天", "冬寒抱冰");


}
