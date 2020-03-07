package cn.com.java.test.factory.simplefactory.pizza;

/**
 * @author llpei
 * @Description:
 * @date Created in 18:04 2020/2/22
 */
public class CheesePizza extends Pizza {

    //实现抽象类中 准备材料的抽象方法
    public void prepare() {
        System.out.println("准备奶酪..");
    }
}
