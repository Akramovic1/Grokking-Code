package com.company;



public class Main {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)   return;
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = reverse(slow);
        ListNode next;
        while(head != null && fast != null){
            next = head.next;
            head.next = fast;
            head = next;
            next = fast.next;
            fast.next = head;
            fast = next;
        }
        if(head != null) head.next = null;
    }

    public static ListNode reverse(ListNode head){
        ListNode curr = head, prev = null, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
