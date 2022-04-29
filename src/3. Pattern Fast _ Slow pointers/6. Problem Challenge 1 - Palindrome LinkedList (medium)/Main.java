package com.company;



public class Main {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = reverse(slow);
        while(head != null && fast != null){
            if(head.val != fast.val) return false;
            head = head.next;
            fast = fast.next;
        }
        return true;
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
