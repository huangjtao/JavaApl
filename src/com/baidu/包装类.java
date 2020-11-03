package com.baidu;

//万事万物皆对象:每一个类都继承了Object
public class 包装类 {
    /**
     * 包装类：基本数据类型所对应的类
     * @param args
     */
    public static void main(String[] args) {
        //int ->Integer
        Integer a=100;
        //字符串转整数
        String s="123";
        int a2=Integer.parseInt(s);
        double a3=Double.parseDouble(s);
        float a4=Float.parseFloat(s);

        int max=Integer.MAX_VALUE;
        System.out.println("max = " + max);
        int min=Integer.MIN_VALUE;
        System.out.println("min = " + min);

        Double w1=78.85;
        int w2=w1.intValue();
        System.out.println("w2 = " + w2);

        //基本数据类型转字符串
        int f=122;
        String s3=""+f;
        System.out.println("s3 = " + s3);

        Integer f1=56788965;
        String s4=f1.toString();
        System.out.println("s4 = " + s4);




    }
}
