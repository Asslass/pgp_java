package com.hit.demo;

/**
 * @author Asslass
 * create time:2019/9/21
 * about:复合语句作用域
 */
public class Compound {
    public static void main(String args[]){
        int x = 20;
        {
            int y = 40;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y > z;
                System.out.println(b);
            }
            //这句为啥不报错？明明在赋值作用域外调用的？
            System.out.println(b);
        }
        String word = "hello java";
        System.out.println(word);
    }
}
