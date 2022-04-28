package com.company;



public class Main {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
    private int cycleLength(ListNode slow){
        ListNode curr = slow;
        curr = curr.next;
        int count = 1;
        while (curr != slow){
            curr = curr.next;
            count++;
        }
        return count;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
          }
    }

    public static void main(String[] args) {

    }
}
