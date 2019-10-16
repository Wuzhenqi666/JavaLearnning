package com.wuzhenqi.java.Recursion;

/**
 * @author JemLeeo
 * @date 2019/10/16 10:19
 */
public class SumAn {
    private int  SumAnLoop(int n){
        int a1 = 1;
        int a2 = 1;
        int tmp  = a1+a2;
        for (int i = 4; i <=n ; i++) {
            if(i%2==0){
                a2 = tmp;
            }else {
                a1 = tmp;
            }
            tmp = a1+a2;
        }
        return  tmp;
    }
    private int SumAnRecursion(int n){
        if(n == 1){
            return 1;
        }else if(n==2){
            return 1;
        }
            return SumAnRecursion(n-1)+SumAnRecursion(n-2);
    }

    public static void main(String[] args) {
        SumAn sumAn = new SumAn();
        System.out.println(sumAn.SumAnLoop(45));
        System.out.println(sumAn.SumAnRecursion(45));
    }
}
