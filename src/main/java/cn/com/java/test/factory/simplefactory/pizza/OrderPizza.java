package cn.com.java.test.factory.simplefactory.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author llpei
 * @Description:
 * @date Created in 18:14 2020/2/22
 * 订购披散的类
 */
public class OrderPizza {
   /* //写一个构造器
    public OrderPizza(){
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        //通过循环来获取pizza对象
        do {
            orderType = getType();
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName(orderType);
            }else if (orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName(orderType);
            }else {
                System.out.println("退出订购程序");
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }*/
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    //定义一个构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    //定义一个设置简单工厂的方法
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("退出订单系统");
                break;
            }
        }while (true);
    }
    //获取订单类型的方法
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
