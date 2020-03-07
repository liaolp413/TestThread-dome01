package cn.com.java.test;

import org.junit.Test;

/**
 * @author llpei
 * @Description:
 * @date Created in 14:53 2020/2/17
 */
public class ThreadDome01 extends Thread {


    public static Thread run(Runnable runnable){
        Thread thread1 = new Thread(runnable);
        thread1.start();
        return thread1;
    }

    public static void main(String[] args) {
        Thread t1 = run(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    @Test
    public void Test01(){
        Thread t2 = run(new Runnable() {
            public void run() {
                synchronized (ThreadDome01.class){

                }
            }
        });
    }

    @Test
    public void Test02(){
        for (int i=1;i<5;i++){
            for (int j=0;j<10;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

