package cn.com.java.test.factory.simplefactory.pizza;

/**
 * @author llpei
 * @Description:
 * @date Created in 19:27 2020/2/22
 */
public class PizzaStore {
    public static void main(String[] args) {
        //OrderPizza orderPizza = new OrderPizza();
        //new OrderPizza(new SimpleFactory());

       Runnable r = () -> {
           new OrderPizza2();
       };

        Thread t1 = new Thread(r, "线程1");
        Thread t2 = new Thread(r, "线程1");
        t1.start();
        t2.start();
    }
}
