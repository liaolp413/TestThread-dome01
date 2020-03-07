package cn.com.java.test.factory.simplefactory.pizza;

/**
 * @author llpei
 * @Description:
 * @date Created in 19:50 2020/2/22
 * 简单工厂类
 */
public class SimpleFactory {
    //定义一个创建pizza对象的方法
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(orderType);
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(orderType);
        }
        return pizza;
    }

    //静态工厂方法
    public static Pizza createPizza2(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName(orderType);
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName(orderType);
        }
        return pizza;
    }
}
