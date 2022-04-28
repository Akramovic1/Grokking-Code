package com.company;



public class Main {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head; ListNode slow = head;
        int k = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                k = calcLength(slow);
                break;
            }
        }
        if(k == 0) return null;
        ListNode start = findStart(k, head);
        return start;
    }
    public int calcLength(ListNode slow){
        ListNode curr = slow.next;
        int count = 1;
        while(curr != slow){
            curr = curr.next;
            count++;
        }
        return count;
    }
    public ListNode findStart(int k, ListNode head){
        ListNode p1 = head;
        ListNode p2 = head;
        while(k > 0){
            p1 = p1.next;
            k--;
        }
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
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
