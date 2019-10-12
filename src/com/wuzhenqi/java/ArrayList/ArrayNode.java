package com.wuzhenqi.java.ArrayList;

/**
 * @author JemLeeo
 * @date 2019/10/12 11:25
 */
public class ArrayNode {
    public int data[];
    public int curLen;
    public int maxSize;
    public ArrayNode(int maxSize){
        data = new int[maxSize];
        this.maxSize = maxSize;
        curLen = 0;
    }
}
