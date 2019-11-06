package com.hit.demo;

/**
 * @author Asslass
 * create time:2019/10/11
 * about:字符串初始化方式比较
 */
public class StrCompare {
    public static void main(String[] args) {
        String str1 = new String("abz");
        String str2 = new String("ade");
        //str3,str4指向内存中同一个位置
        String str3 = "a";
        String str4 = "a";
//        System.out.println("str1=str2?"+(str1 == str2 ));
        System.out.println("str3=str4?"+(str3 == str4 ));
//        System.out.println("str1 equal str2?"+(str1.equals(str2) ));
        System.out.println("str3 equal str4?"+(str3.equals(str4) ));
        System.out.println("str1.compareTo(str2):"+(str1.compareTo(str2)));
//        String str5 = str1;
//        str5 = "b";
//        System.out.println("str1="+str1);
    }
}
