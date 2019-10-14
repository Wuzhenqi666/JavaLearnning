package com.wuzhenqi.java.Stack;

import java.util.Scanner;

/**
 * @author JemLeeo
 * @date 2019/10/13 22:11
 */
public class InputCheck {
    public boolean isMatch(String symbS,String symbD){
        boolean flag;
        if(symbS.equals("{")&&symbD.equals( "}")){
            flag = true;
        }
        else if(symbS.equals("[")&&symbD.equals( "]")){
            flag = true;
        }
        else if(symbS.equals("(")&&symbD.equals( ")")) {
            flag = true;
        }
        else
            flag = false;
        return flag;
    }
    public void check() throws Exception{
        StackArrayNode stackArrayNode = new StackArrayNode(15);
        boolean flag = true;
        String result = "";
        int inputCount = 0;
        while(flag){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(input);
            if(inputCount==0||(stackArrayNode.top!=-1&&!isMatch(stackArrayNode.getTop(),input))){
                result = result+input;
                stackArrayNode.push(input);
                System.out.println("不通过："+result);
                inputCount++;
            }else if(stackArrayNode.top!=0&&isMatch(stackArrayNode.getTop(),input)){
                stackArrayNode.pop();
                result = result+input;
                System.out.println("不通过："+result);
            }else if(inputCount!=0&&stackArrayNode.top==0){
                result = result+input;
                System.out.println("通过："+ result);
                flag = false;
            }else{
                System.out.println("erro");
            }
        }

    }
    public static void main(String[] args) throws Exception {
//        InputCheck inputCheck = new InputCheck();
//        inputCheck.check();
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        System.out.println(inputCheck.isMatch(input,"}"));
        String s = "Hello";
        System.out.println(s.charAt(1));
    }
}
