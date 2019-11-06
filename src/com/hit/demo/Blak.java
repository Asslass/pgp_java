package com.hit.demo;

/**
 * @author Asslass
 * create time:2019/10/11
 * about:
 */
public class Blak {
    public static void main(String[] args) {
        String str = "  Java   class  ";
        System.out.println("字符串原来的长度："+str.length());
        String strWithoutBlak = str.trim();
        System.out.println("字符串后来的长度："+strWithoutBlak.length());
        System.out.println("后来的字符串："+strWithoutBlak);
        //strCut = Jav,实际上是2~4位
        String strCut = str.substring(2,5);
        System.out.println("剪切后的字符串为："+strCut);
        //按内容返回下标
        int indexA = str.indexOf("a");
        System.out.println("a的下标为："+indexA);
    }
}
