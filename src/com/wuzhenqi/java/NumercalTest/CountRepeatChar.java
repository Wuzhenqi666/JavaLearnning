package com.wuzhenqi.java.NumercalTest;


/**
 * @author JemLeeo
 * @date 2019/10/13 20:58
 */
public class CountRepeatChar {
    public void printCharArr(char[]data){
        for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i]);
        }
    }

    public String CountReapt(char[]data)  {
        String result = "";
        int count = 1;
        if(data.length==1){
            result = String.valueOf(data)+"1";
        }else{
            for (int i = 0; i <data.length-1; i++) {
                if(data[i]==data[i+1]){
                    count++;
                }else if(i==data.length-2&&data[i]!=data[i+1]){
                    result = result +data[i]+count+data[i+1]+1;
                } else{
                    result = result + data[i] + count;
                    count = 1;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
       // char data[]= {'a','a','a','b','b','c','c','d'};
        char data[]= {'a'};
        CountRepeatChar countRepeatChar  =new CountRepeatChar();
        CountRepeatChar countRepeatChar1 = new CountRepeatChar();
       // countRepeatChar.printCharArr(data);
        System.out.println(countRepeatChar.CountReapt(data));
        System.out.println(countRepeatChar);
        System.out.println(countRepeatChar1);

    }

}
