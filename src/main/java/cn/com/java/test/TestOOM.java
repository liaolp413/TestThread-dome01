package cn.com.java.test;

/**
 * @author llpei
 * @Description:
 * @date Created in 11:44 2020/3/3
 */
public class TestOOM {
    private static int count = 1;
    public static void main(String[] args) {
        count++;
        System.out.println(count);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        main(args);
    }
}
