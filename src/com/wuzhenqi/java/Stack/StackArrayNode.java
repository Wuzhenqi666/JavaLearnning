package com.wuzhenqi.java.Stack;

/**
 * @author JemLeeo
 * @date 2019/10/12 21:20
 */
public class StackArrayNode {
    public  int maxSize;
    private String[] stackArra;
    public int top;

    public StackArrayNode(int maxSize) {
        this.maxSize = maxSize;
        top = -1;
        stackArra = new String[maxSize];
    }

    public void push(String data)throws Exception{
        if(top==maxSize){
            throw new Exception("栈已满");
        }else{
            top++;
            stackArra[top] = data;
        }
    }
    public void pop() throws Exception {
        if(top==-1){
            throw new Exception("栈已空");
        }else{
            stackArra[top] = null;
            top--;
        }
    }
    public String getTop() throws Exception {
        if(top==-1){
            throw new Exception("栈已空");
        }else{
            return stackArra[top];
        }
    }
    public void prinStackArray(){
        int tmp = top;
        while(tmp!=-1){
            System.out.print(stackArra[tmp]+"==>");
            tmp--;
        }
        System.out.println();
    }

    public static void main(String[] args)throws Exception {
        StackArrayNode stackArrayNode = new StackArrayNode(10);
        stackArrayNode.push("a");
        stackArrayNode.push("b");
        stackArrayNode.push("c");
        stackArrayNode.prinStackArray();
        stackArrayNode.pop();
        stackArrayNode.pop();
        stackArrayNode.pop();

        stackArrayNode.prinStackArray();
    }

}
