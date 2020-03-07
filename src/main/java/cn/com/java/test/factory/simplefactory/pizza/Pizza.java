package cn.com.java.test.factory.simplefactory.pizza;

/**
 * @author llpei
 * @Description:
 * @date Created in 17:57 2020/2/22
 */
public abstract class Pizza {
    protected String name; //披散的名字
    //准备材料的抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name+ " baking");
    }

    public void cut(){
        System.out.println(name+" cutting");
    }

    public void box(){
        System.out.println(name+" boxing");
    }

    public void setName(String name){
        this.name = name;
    }
}
