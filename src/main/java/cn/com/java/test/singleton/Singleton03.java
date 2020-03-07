package cn.com.java.test.singleton;

/**
 * @author llpei
 * @Description:
 * @date Created in 15:45 2020/2/22
 * 单例模式 懒汉式 线程不安全
 */
public class Singleton03 {
    public static  Singleton03 singleton03;

    private Singleton03(){
        System.out.println("这是一个单例");
    }

    public static  Singleton03 getSingleton03(){
        if (singleton03==null){
            singleton03 = new Singleton03();
        }
        return singleton03;
    }
}
