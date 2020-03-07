package cn.com.java.test.singleton;

/**
 * @author llpei
 * @Description:
 * @date Created in 15:48 2020/2/22
 * 单例模式 懒汉式 线程安全
 */
public class Singleton04 {

    public static Singleton04 singleton04;

    private Singleton04(){

    }

    public  static Singleton04 getSingleton04(){
        if (singleton04==null){
            //添加一个对象所
            synchronized (Singleton04.class){
                if (singleton04==null){
                    singleton04 = new Singleton04();
                }
            }
        }
        return singleton04;
    }

    //通过静态内部类 获取对象

    static class SingletonTest{
        public static Singleton04 singleton04 = new Singleton04();
    }

    public static Singleton04 getInstance(){
        return SingletonTest.singleton04;
    }
}
