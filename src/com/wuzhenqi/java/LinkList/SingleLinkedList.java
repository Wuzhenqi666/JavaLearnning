package com.wuzhenqi.java.LinkList;

import java.awt.*;

/**
 * @author JemLeeo
 * @date 2019/10/11 22:36
 */
public class SingleLinkedList {
    private Integer size;
    private Node head;
    public  SingleLinkedList(){
        size = 0;
        head = null;
    }

    public Node addHead(String data){
        Node node = new Node(data);
        if(size==0){
            head = node;
        }else{
            node.next = head;
            head = node;
        }
        size++;
        return head;
    }
    public Node deleteHead(){
        if(size==0){
            return head;
        }else{
            head.data = head.next.data;
            head = head.next;
            size --;
        }
    return head;
    }
    public void printLinkList(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+"==>");
            node = node.next;
        }
        System.out.print("NULL\n");
    }
    public Node findData(String data){
        Node node = head;
        while(node.next!=null){
            if(data.equals(node.data)){
                return node;
            }else{
                node = node.next;
            }
        }
        return null;
    }
    public Node deleteData(String data){
        Node node = head;
        Node currentNode = head;
        if(data.equals(head.data)){
            head = head.next;
        }else {
            while (node.next != null) {
                if (data.equals(node.data)) {
                    currentNode.next = node.next;
                    return head;
                } else {
                    currentNode = node;
                    node = node.next;
                }
            }
        }
        size --;
        return head;
    }
    public Node reveLinklist(){
        Node node = head;
        int index = 1;
        while (node.next!=null){
            node = node.next;
            Node tmpNode = new Node(node.data);
            tmpNode.next = head;
            if(index == 1){
                head.next = null;
            }
            index++;
            head = tmpNode;
        }
        return head;
    }

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addHead("node1");
        singleLinkedList.addHead("node2");
        singleLinkedList.addHead("node3");
        singleLinkedList.addHead("node4");
        singleLinkedList.addHead("node5");
        singleLinkedList.addHead("node6");
        singleLinkedList.addHead("node7");
        singleLinkedList.printLinkList();
        singleLinkedList.reveLinklist();
        singleLinkedList.printLinkList();
    }

}
