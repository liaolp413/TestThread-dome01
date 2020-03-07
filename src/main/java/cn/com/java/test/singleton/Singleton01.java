package cn.com.java.test.singleton;

import java.util.Calendar;

/**
 * @author llpei
 * @Description:
 * @date Created in 16:41 2020/2/21
 * 单例模式 饿汉
 */
public class Singleton01 {
    /**
     * 1.构造器私有化
     * 2.定义静态实例变量
     * 3.提供外部获取对象的静态方法
     * */
    public static final  Singleton01 SINGLETON_01 = new Singleton01();
    private Singleton01(){
    }
    public static Singleton01 getSingleton01(){
        return SINGLETON_01;
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.MONTH));
    }
}
