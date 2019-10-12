package com.wuzhenqi.java.ArrayList;

/**
 * @author JemLeeo
 * @date 2019/10/12 11:25
 */
public class ArrayNode {
    public long data[];
    public int curLen;
    public int maxSize;
    public ArrayNode(int maxSize){
        data = new long[maxSize];
        this.maxSize = maxSize;
        curLen = 0;
    }
}
