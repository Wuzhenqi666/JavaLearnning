package com.wuzhenqi.java.LeetCode;

/**
 * @author JemLeeo
 * @date 2019/10/14 15:43
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
*
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
*/
 public class SortTwoLinkList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        return l1;
    }

        public void printLinkList (ListNode listNode){
            while (listNode != null) {
                System.out.print(listNode.val + "==》");
                listNode = listNode.next;
            }
            System.out.println();
        }

        public static void main (String[]args){
            SortTwoLinkList sortTwoLinkList = new SortTwoLinkList();
            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(2);
            ListNode l3 = new ListNode(3);
            ListNode l4 = new ListNode(4);

            l1.next = l2;
            l2.next = l3;
            l3.next = l4;

            ListNode l5 = new ListNode(3);
            ListNode l6 = new ListNode(5);
            ListNode l7 = new ListNode(9);
            l5.next = l6;
            l6.next = l7;
            sortTwoLinkList.printLinkList(l1);

            sortTwoLinkList.printLinkList(sortTwoLinkList.mergeTwoLists(l1, l5));
        }

}
