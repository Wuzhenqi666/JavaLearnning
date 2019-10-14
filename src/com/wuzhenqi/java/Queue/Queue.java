package com.wuzhenqi.java.Queue;

/**
 * @author JemLeeo
 * @date 2019/10/14 21:53
 */
public class Queue {
    private int maxSize;
    private Object[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize){
        this.maxSize = maxSize;
        queArray = new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(Object o){
        if(rear==maxSize-1) {
            rear = -1;
        }
        queArray[++rear] = o;
        nItems ++;

    }
    public Object remove()throws Exception{
        if(front==maxSize){
            front = 0;
        }
        nItems --;
        return queArray[front++];//先取值，再自减
    }
    public Object peakFront(){
        return queArray[front];
    }

    public void printQueue(){
        for (int i = front; i <front+nItems ; i++) {
            System.out.print(queArray[i]+"<==");
        }
        System.out.println();
    }
    public static void main(String[] args)throws Exception {
        Queue queue = new Queue(5);
        queue.insert("a");
        queue.insert("b");
        queue.insert("c");
        queue.insert("d");
        queue.insert("e");
        queue.remove();
        queue.printQueue();


    }
}
