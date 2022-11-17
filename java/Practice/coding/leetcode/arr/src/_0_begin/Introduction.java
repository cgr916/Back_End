package _0_begin;

/**
 * @author: cgr
 * @date: 2022/9/24 - 20:32
 */
public class Introduction {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();
        StringBuilder sd = new StringBuilder();
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        s3 = "def";
        System.out.println(s3);
        change(s3);
        System.out.println(s3);
//        System.out.println(s1 == s2);
//        System.out.println(s3);

    }

    public static void change(String s){
        s = "ghi";
    }

    public void sout(){
        System.out.println("haha");
        sp();
    }

    private void sp(){
        System.out.println("woo");
    }

    class  testStr{
        public final byte[] value = new byte[3];
    }

    /*
    *      g  1、基本排序知识：基础 -> 冒泡排序、选择排序、插入排序、希尔排序;
    *                        快速 -> 快排：随机优化、 归并排序：算法复杂度、 堆排序：初始化+重建堆;
    *        2、数组与树：前序遍历根左右、中序遍历左根右,后序遍历左右根;
    *                   => 因此，前序遍历，根节点总在前;后序遍历，根节点总在后;
    *        3、数组与前缀法：
    * arr：
    *        4、排列与组合：--
    *
    *        5、数组与二分法：注意使用 l,r;
    *
    *        6、数组、双指针：查找、去重
    *
    *        7、最大、最小类问题：双指针/边记录边比较/无序子数组
    *
    *        8、与 哈希表 的结合：
    *
    *        9、数组与 动态规划思想：
    * */
}
