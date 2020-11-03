package com.baidu;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Equals;

public class 字符串 {

    public static void main(String[] args) {
        //定义字符串有两种格式
        String s="隔壁老王,有空常来玩abcdef";
        String s2=new String("隔壁老王,有空常来玩AbCdEf");

        char c=s.charAt(4);
        System.out.println("c = " + c);
        //字符串截取 subString
        String s3=s.substring(2,4);//含上不含下
        System.out.println("s3 = " + s3);

        //类相等不能使用 ==
        //对象使用 == 代表判断地址是否相等
        //equals 判断值相等
        //equalsIgnoreCase 忽视大小写进行比较【验证码】
        //contains 是否包含...
        if (s.equals(s2)){
            System.out.println("相等");
        }
        if(s.equalsIgnoreCase(s2)){
            System.out.println("相等");
        }
        if(s.contains("老王")){
            System.out.println("相等");
        }

        String user="1001;张三;18;男";
        String[] arr=user.split(";");
        System.out.println(arr[1]);
        String sex=arr[3];
        System.out.println(sex);

        String email="12345678@qq.com";
        email=email.toLowerCase();//大写转小写
        if(email.endsWith("@qq.com"))
        {
            System.out.println("这是一个QQ邮箱!!");
        }


    }


}
