package com.wuzhenqi.java.LinkList;

/**
 * @author JemLeeo
 * @date 2019/10/15 22:12
 */
public class IteratorApp {
    public static void main(String[] args) {

        LinkList linkList = new LinkList();
        linkList.insert("jemleeo");
        linkList.insert("liugen");
        linkList.insert("keelia");
        linkList.insert("songsong");
        linkList.insert("yifan");

        ListIterator listIterator1 = new ListIterator(linkList);
        ListIterator listIterator2 = new ListIterator(linkList);

        System.out.println(listIterator1.atEnd());
        while(!listIterator1.atEnd()){
            listIterator1.nextNode();
        }
        System.out.println(listIterator1.getCurrent());

        listIterator1.reset();
        while(!listIterator1.getCurrent().data.equals("keelia")){
            listIterator1.nextNode();
        }
        System.out.println(listIterator1.getCurrent());


    }
}
