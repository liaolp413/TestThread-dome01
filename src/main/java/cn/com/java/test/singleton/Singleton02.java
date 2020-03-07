package cn.com.java.test.singleton;

/**
 * @author llpei
 * @Description:
 * @date Created in 21:36 2020/2/21
 * 单例模式 饿汉式 静态代码块获取
 */
public class Singleton02 {

    public static  Singleton02 singleton02;

    private Singleton02(){}
    //静态代码块在类一加载时就会执行
    static {
        singleton02 = new Singleton02();
    }

    public static Singleton02 getSingleton02(){
        return singleton02;
    }


}
