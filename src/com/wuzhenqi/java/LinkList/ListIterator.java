package com.wuzhenqi.java.LinkList;

/**
 * @author JemLeeo
 * @date 2019/10/15 20:14
 */
public class ListIterator {
    private Node current;
    private Node previous;
    private LinkList ourLinkList;
    ListIterator(LinkList ourlinkList){
        this.ourLinkList = ourlinkList;
        reset();
    }
    public void reset(){
        current = ourLinkList.getFirst();
        previous = null;
    }
    public boolean atEnd(){
        return current.next==null;
    }
    public void nextNode(){
        previous = current;
        current = current.next;
    }
    public Node getCurrent(){
        return current;
    }
    public void insertAfter(String data){
        Node node = new Node(data);
        if(ourLinkList.isEmpty()){
            ourLinkList.setFirst(node);
            current = node;
        }else{
            node.next = current.next;
            current.next = node;
            nextNode();
        }
    }
    public void insertBefore(String data){
        Node node = new Node(data) ;
        if(previous==null){
           node.next = ourLinkList.getFirst();
           ourLinkList.setFirst(node);
           reset();
        }else{
            previous.next = node;
            node.next = current;
            current = node;
        }
    }
    public String deleteCurrent(){
        String result = current.data;
        if(previous==null){
            ourLinkList.setFirst(current.next);
        }else{
            previous.next = current.next;
            if(atEnd()){
                reset();
            }else
            current = current.next;
        }
        return result;
    }
}
