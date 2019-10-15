package com.wuzhenqi.java.LinkList;

/**
 * @author JemLeeo
 * @date 2019/10/15 20:02
 */
public class LinkList {

    private Node first;

    LinkList(){
        first = null;
    }
    public void insert(String data){
        Node node = new Node(data);
        node.next = first;
        first = node;
    }
    public void printLinkList(){
        Node node = first;
        while(node!=null){
            System.out.print(" <== " +node.data);
            node = node.next;
        }
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }
    public boolean isEmpty(){
        if(first==null)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insert("b");
        linkList.insert("a");
        Node newNode = new Node("c");
        Node current = linkList.first.next;
        newNode.next = current.next;
        current.next = newNode;
        linkList.printLinkList();

    }
}
