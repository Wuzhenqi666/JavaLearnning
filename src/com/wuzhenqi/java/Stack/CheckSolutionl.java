package com.wuzhenqi.java.Stack;

import java.util.Stack;

/**
 * @author JemLeeo
 * @date 2019/10/14 15:14
 */
public class CheckSolutionl {
    public boolean isMatch(String S,String D){
        boolean flag;
        if(S.equals("{")&&D.equals("}")){
            flag = true;
        }else if(S.equals("[")&&D.equals("]")){
            flag = true;
        }else if(S.equals("(")&&D.equals(")")){
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }
    public boolean isValid(String s) {
        if(s==null)
            return true;
        else{
            int length = s.length();
            Stack<String> stack = new Stack<>();
            for(int i = 0;i<length;i++){
                if(i==0||stack.isEmpty()){
                    stack.push(String.valueOf(s.charAt(i)));
                }else if(i>0&&!isMatch(stack.peek(),String.valueOf(s.charAt(i)))){
                    stack.push(String.valueOf(s.charAt(i)));
                } else
                    stack.pop();
            }

            if(stack.empty()){
                return true;
            }else
                return false;
        }
    }

    public static void main(String[] args) {
        String s = "{}{}";
        CheckSolutionl checkSolutionl = new CheckSolutionl();
        System.out.println(checkSolutionl.isValid(s));
    }
}