package com.hit.demo;

/**
 * @author Asslass
 * create time:2019/9/24
 * about:for练习
 */
public class For {
    public static void main(String[] args) {
        int i = 0;
        for (;;){
            System.out.println(++i);
            if (i == 5){
                break;
            }
        }
    }
}
