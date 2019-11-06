package com.hit.demo;

/**
 * @author Asslass
 * create time:2019/10/31
 * about:
 */
public class Jerque {
    public static void main(String[] args) {
        String str = "";
        long starTime = System.currentTimeMillis();
        for (int i = 0; i<10000; i++){
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        System.out.println("String消耗时间：" + time);
        System.out.println("String内容：" + str);
        StringBuilder builder = new StringBuilder("");
        starTime = System.currentTimeMillis();
        for (int j = 0; j<10000; j++){
            builder = builder.append(j);
        }
        endTime = System.currentTimeMillis();
        time = endTime - starTime;
        System.out.println("String消耗时间：" + time);
        System.out.println("StringBuilder类型：" + builder.getClass());
    }
}
