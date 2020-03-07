package cn.com.java.test.factory.simplefactory.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author llpei
 * @Description:
 * @date Created in 20:26 2020/2/22
 */
public class OrderPizza2 {
    String orderType = "";
    Pizza pizza  = null;
    //定义构造方法
    public OrderPizza2(){
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("退出系统");
                break;
            }
        }while (true);
    }
    //获取订单类型的方法
    private String getType(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
