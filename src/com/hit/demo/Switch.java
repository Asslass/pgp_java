package com.hit.demo;

/**
 * @author Asslass
 * create time:2019/9/24
 * about:switch练习
 */
public class Switch {
    public static void main(String[] args) {
        String str = "明日科技";
        switch (str){
            case "明日":
                System.out.println("明日图书网");
                break;
            case "明日科技":
                System.out.println("明日科技有限公司");
                break;
            default:
                System.out.println("以上条件都不是。");
        }
    }
}
