package com.wuzhenqi.java.Stack;

/**
 * @author JemLeeo
 * @date 2019/10/12 21:20
 */
public class StackArrayNode {
    int maxSize;
    String[] stackArra;
    int curentLen;

    public StackArrayNode(int maxSize) {
        this.maxSize = maxSize;
        curentLen = 0;
        stackArra = new String[maxSize];
    }
}
