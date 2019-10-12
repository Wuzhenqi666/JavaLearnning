package com.wuzhenqi.java.LinkList;

/**
 * @author JemLeeo
 * @date 2019/10/11 22:32
 */
public class Node {
    public String data;
    public Node next;

    public Node(String data) {
        this.data = data;
    }

    public  Node(){

    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }
}
