package com.atguigu.java;

/**
 * @author paipai
 * @create 2021-01-26 18:45
 */
public class AriExer {
    public static void main(String[] args) {
        int num = 146;
        int bai = num / 100;
        int shi = num % 100 / 10;
        int ge = num % 10;
        System.out.println("百位：" + bai);
        System.out.println("十位：" + shi);
        System.out.println("个位：" + ge);
    }
}
