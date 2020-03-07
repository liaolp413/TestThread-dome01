package cn.com.java.test;

import java.util.Arrays;

/**
 * @author llpei
 * @Description:
 * @date Created in 22:05 2020/2/17
 */
public class Demo02 {
    public static void main(String[] args) {
        int i = 1;
        String str = "hello";
        Integer num = 10;
        int[] arr = {1,2,3,4,5};
        MyData myData = new MyData();
        change(i,str,num,arr,myData);
        System.out.println("i ="+i);
        System.out.println("str ="+str);
        System.out.println("num ="+num);
        System.out.println("arr ="+ Arrays.toString(arr));
        System.out.println("myData ="+myData.a);
    }

    public static void change(int j,String s,Integer n,int[] a,MyData m){
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a  += 1;
    }

    static class MyData{
        int a = 10;
    }
}
