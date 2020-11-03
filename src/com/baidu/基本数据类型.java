package com.baidu;

public class 基本数据类型 {
     //int char byte short long float double boolean
    public static void main(String[] args) {
         int a=10;
         char sex='\u7537';//unicode 编码
        System.out.println("sex = " + sex);
        boolean b=false;
        float f1=10.25f;
        double d1=154.41545;
        long k1=646546546;//4251L or 3125l
        long k2=1211l;
        byte b1=100;
        short w=100;

        //类型自动转换
        /**
         * 低(弱)  ------------------------------------>  高(强)
         * byte,short,char—> int —> long—> float —> double
         */
        int y1=100;
        double y2=y1;

        //'a' -->97  'A'-->65
        char m1='a'-32;
        System.out.println("m1 = " + m1);
        int m2=m1;
        System.out.println("m2 = " + m2);

        //强（高）-------->弱（低）   强制转换
        double x=12.5;
        int x1=(int)x; //风险  精度丢失  失真
        System.out.println("x1 = " + x1);


    }

}
