package cn.com.java.test.interfaceAf;

/**
 * @author llpei
 * @Description:
 * @date Created in 16:37 2020/2/22
 */
public class TestA {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(){
            @Override
            public void m1() {
                super.m1();
            }
        };
        adapter.m1();
    }
}
