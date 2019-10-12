package com.wuzhenqi.java.ArrayList;

/**
 * @author JemLeeo
 * @date 2019/10/12 11:27
 */
public class ArrayList {
    int maxSize;
    private ArrayNode arrayNode;

    public ArrayList(int maxSize) {
        this.maxSize = maxSize;
        this.arrayNode = new ArrayNode(maxSize);
    }

    public boolean isEmpty(){
        return  arrayNode.curLen==0;
    }
    public long getElem(int index){
        return arrayNode.data[index];
    }
    public ArrayNode insertElem(int index,long data) throws Exception {
        if (arrayNode.curLen == arrayNode.maxSize) {
            throw new Exception("顺序表已满");
        }else if(index>arrayNode.curLen||index<0){
            throw new Exception("位置不合理");
        }else{
            long tmp1 = arrayNode.data[index];
            arrayNode.data[index] = data;
            for (int i = index+1; i <=arrayNode.curLen ; i++) {
                long tmp2 = arrayNode.data[i];
                arrayNode.data[i] = tmp1;
                tmp1 = tmp2;
            }
            arrayNode.curLen++;
        }
        return  arrayNode;
    }

    public void prinArrayList(){
        for (int i = 0; i <arrayNode.curLen ; i++) {
            System.out.print("["+arrayNode.data[i]+"]"+"==>");
        }
        System.out.println();
    }



    public static void main(String[] args) throws Exception {
        ArrayList arrayList = new ArrayList(10);
        arrayList.insertElem(0,1L);
        arrayList.insertElem(1,2L);
        arrayList.insertElem(2,3L);
        arrayList.insertElem(3,4L);
        arrayList.insertElem(4,5L);
        arrayList.prinArrayList();
        arrayList.insertElem(0,6L);
        arrayList.prinArrayList();
        System.out.println(arrayList.getElem(3));
    }
}
