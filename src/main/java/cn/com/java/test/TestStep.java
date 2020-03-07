package cn.com.java.test;

import org.junit.Test;

/**
 * @author llpei
 * @Description:
 * @date Created in 10:19 2020/2/18
 */
public class TestStep {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i =1;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+"-"+new TestStep().f(i));
                }
            }
        };
        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
         t1.start();
         t2.start();
    }

    /**
     * 测试递归
     * */
    public int f(int i){
        if (i<1){
            throw new IllegalArgumentException(i+"i不能小于0");
        }
        if (i==1||i==2){
            return i;
        }
        return f(i-2)+f(i-1);
    }

    @Test
    public void Test01(){
        System.out.println(f(10));

    }
}
