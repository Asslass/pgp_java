package com.hit.demo;

/**
 * @author Asslass
 * create time:2019/10/9
 * about:
 */
public class BreakOutsideNested {
    public static void main(String[] args) {
        Loop: for (int i = 0; i < 3; i++){
            for (int j = 0; j < 6; j++){
                if (j == 4){
                    break Loop;
                }
                System.out.println("i ="+i+",j ="+j);
            }
        }
    }
}
