package com.wuzhenqi.java.Recursion;

/**
 * @author JemLeeo
 * @date 2019/10/16 9:59
 */
public class SumTriangle {
    private int triangle(int n){
        int result = 1;
        for (int i = 2; i <=n ; i++) {
            result = result+i;
        }
        return result;
    }
    private int RecursionTriangle(int n){
        if(n==1){
            return 1;
        }
        return n+RecursionTriangle(n-1);

    }

    public static void main(String[] args) {
        SumTriangle sumTriangle = new SumTriangle();
        System.out.println(sumTriangle.triangle(10000));
        System.out.println(sumTriangle.RecursionTriangle(10000));
    }
}
