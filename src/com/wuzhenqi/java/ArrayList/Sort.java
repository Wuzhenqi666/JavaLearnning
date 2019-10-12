package com.wuzhenqi.java.ArrayList;
import javax.swing.*;
import java.util.Random;

/**
 * @author JemLeeo
 * @date 2019/10/12 13:28
 */
public class Sort {

    public ArrayList BubbleSort(ArrayList arrayList){
        int length = arrayList.arrayNode.curLen;
        int[] array = arrayList.arrayNode.data;
        for (int i = 0; i <length-1; i++) {
            int bigData = array[0];
            for (int j = 1; j <length-i ; j++) {
                if(bigData>array[j]){
                    array[j-1] = array[j];
                    array[j] = bigData;
                }else
                    bigData = array[j];
            }
        }
        arrayList.arrayNode.data = array;
        return arrayList;
    }
    public ArrayList SelectSort(ArrayList arrayList){
        int length = arrayList.arrayNode.curLen;
        int[] array = arrayList.arrayNode.data;
        for (int i = 0; i <length-1 ; i++) {
            int bigData = array[0];
            int bigIndex = 0;
            for (int j = 1; j <length-i ; j++) {
                if(array[j]>bigData){
                    bigIndex = j;
                    bigData = array[j];
                }
            }
            array[bigIndex] = array[length-i-1];
            array[length-1-i] = bigData;
        }
        arrayList.arrayNode.data = array;
        return arrayList;
    }
    
    public ArrayList insertSort(ArrayList arrayList){
        int length  =arrayList.arrayNode.curLen;
        int[] array = arrayList.arrayNode.data;

        for (int index = 1; index <length-1 ; index++) {
            int tmp = array[index];
            int leftindex = index -1;
            while(leftindex>=0 && array[leftindex]>tmp){
                array[leftindex+1] = array[leftindex];
                leftindex--;
            }
            array[leftindex+1] = tmp;
        }
        arrayList.arrayNode.data = array;
        return arrayList;
    }

    public ArrayList insertSortForLoop(ArrayList arrayList){
        int length  =arrayList.arrayNode.curLen;
        int[] array = arrayList.arrayNode.data;
        for (int index = 1; index <length ; index++) {
            int tmp = array[index];
            for (int i = index-1; i >=0 ; i--) {
                if(array[i]<tmp){
                    break;
                }else{
                    array[index] = array[i];
                }
            }
            array[index] = tmp;
        }
        arrayList.arrayNode.data = array;
        return  arrayList;
    }

    public int[] quickSort(int[] array,int start,int end){
        int base = array[start];
        int i = start;
        int j = end;
        while(i<j){
            while(i<j&&array[i]<base){
                i++;
            }
            while (i<j&&array[j]>base){
                j--;
            }
            if(array[i]==array[j]&&(i<j)){
                i++;
            }else{
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        if(j+1<end) quickSort(array,j+1,end);
        if(i-1>start) quickSort(array,start,i-1);
        return array;
    }
    public static void main(String[] args) throws Exception {
        int maxSize = 10;
        int min = 0;
        int max = 10;
        ArrayList arrayList = new ArrayList(maxSize);
        for (int i = 0; i <maxSize ; i++) {
            Random random = new Random();
            arrayList.insertElem(i,min+random.nextInt(max));
        }
        arrayList.prinArrayList();

        System.out.println("冒泡排序：");
        long  startSortTime = System.currentTimeMillis();
        Sort sort = new Sort();
        sort.BubbleSort(arrayList).prinArrayList();
        long  endSortTime = System.currentTimeMillis();
        System.out.println("冒泡排序用时： "+ (endSortTime-startSortTime)+"ms");

        System.out.println("选择排序：");
        long startSelectSort = System.currentTimeMillis();
        sort.SelectSort(arrayList).prinArrayList();
        long endSelectSort = System.currentTimeMillis();
        System.out.println("选择排序用时： "+ (endSelectSort-startSelectSort)+"ms");

        System.out.println("插入排序：");
        long startInsertSort = System.currentTimeMillis();
        sort.insertSort(arrayList).prinArrayList();
        long endInsertSort = System.currentTimeMillis();
        System.out.println("插入排序用时： "+ (endInsertSort-startInsertSort)+"ms");

        System.out.println("插入排序：(for循环)");
        long startInsertSortForloop = System.currentTimeMillis();
        sort.insertSortForLoop(arrayList).prinArrayList();
        long endInsertSortForLoop = System.currentTimeMillis();
        System.out.println("插入排序用时：(for循环) "+ (endInsertSortForLoop-startInsertSortForloop)+"ms");


        System.out.println("快速排序：");
        long startQiuckSort = System.currentTimeMillis();
        arrayList.arrayNode.data = sort.quickSort(arrayList.arrayNode.data,0,arrayList.arrayNode.curLen-1);
        arrayList.prinArrayList();
        long endQiuckSort = System.currentTimeMillis();
        System.out.println("快速排序用时："+ (endQiuckSort-startQiuckSort)+"ms");

    }

}
