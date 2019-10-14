//package com.wuzhenqi.java.Stack;
//
///**
// * @author JemLeeo
// * @date 2019/10/12 21:10
// */
//public class Stack {
//    int maxSize;
//   public StackArrayNode stackArrayNode;
//   public  StackLinkNode top;
//
//   public Stack(int maxSize){
//       stackArrayNode = new StackArrayNode(maxSize);
//   }
//
//   public Stack(StackLinkNode stackLinkNode){
//        this.top = stackLinkNode;
//   }
//   public Boolean isEmpty(){
//       return stackArrayNode.curentLen==0;
//   }
//    public Boolean isEmptyStackLink(){
//       if(top.next==null){
//           return true;
//       }else{
//           return false;
//       }
//    }
//   public StackArrayNode push(String data)throws Exception{
//       if(stackArrayNode.curentLen==stackArrayNode.maxSize){
//           throw new Exception("栈已满");
//       }else{
//           stackArrayNode.stackArra[stackArrayNode.curentLen]=data;
//           stackArrayNode.curentLen++;
//       }
//       return stackArrayNode;
//   }
//
//   public StackLinkNode pushStackLink(String data){
//       StackLinkNode stackLinkNode = new StackLinkNode(data);
//       stackLinkNode.next = top;
//       top = stackLinkNode;
//       return top;
//   }
//
//   public StackArrayNode pop() throws Exception{
//       if(stackArrayNode.curentLen==0){
//           throw new Exception("栈已空");
//       }else{
//           stackArrayNode.stackArra[stackArrayNode.curentLen]=null;
//           stackArrayNode.curentLen--;
//       }
//       return stackArrayNode;
//   }
//
//   public StackLinkNode popStackLink()throws Exception{
//       if(top==null){
//           throw new Exception("栈已空");
//       }else{
//           top = top.next;
//       }
//       return top;
//   }
//
//   public void printStackLink(){
//       StackLinkNode stackLinkNode = top;
//       while(stackLinkNode!=null){
//           System.out.print(stackLinkNode.data+"==>");
//           stackLinkNode = stackLinkNode.next;
//       }
//       System.out.println();
//   }
//   public void printStack(){
//       for (int i = 0; i <stackArrayNode.curentLen ; i++) {
//           System.out.print(stackArrayNode.stackArra[i]+"<==");
//       }
//       System.out.println();
//   }
//
//   public String getTop(){
//       String top = stackArrayNode.stackArra[stackArrayNode.curentLen-1];
//       return top;
//   }
//
//   public String getTopStackLink(){
//       String topData = top.data;
//       return topData;
//   }
//
//    public static void main(String[] args)throws Exception{
//        Stack stack = new Stack(10);
//        stack.push("a");
//        stack.push("b");
//        stack.push("c");
//        stack.push("d");
//        stack.push("e");
//        stack.push("f");
//        stack.push("g");
//        stack.push("h");
//        stack.printStack();
//        stack.pop();
//        stack.printStack();
//        System.out.println(stack.getTop());
//
//        stack.pushStackLink("a");
//        stack.pushStackLink("b");
//        stack.pushStackLink("c");
//        stack.pushStackLink("d");
//        stack.pushStackLink("d");
//        stack.printStackLink();
//        System.out.println(stack.getTopStackLink());
//
//        stack.popStackLink();
//        stack.printStackLink();
//        stack.popStackLink();
//        stack.printStackLink();
//        stack.popStackLink();
//        stack.printStackLink();
//
//    }
//}
