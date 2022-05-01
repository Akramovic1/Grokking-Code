import java.util.*;

public class Main {
    public ListNode reverseBetween(ListNode head, int p, int q) {
        if(p == q) return head;
        ListNode prev = null, current = head, next;
        int i;
        for(i = 1; current != null && i < p; i++){
            prev = current;
            current = current.next;
        }
        ListNode lastNodeOfFirstPart = prev;
        ListNode lastNodeOfSubList = current;
        for(i = 0; current != null && i <= q-p; i++){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(lastNodeOfFirstPart != null)
            lastNodeOfFirstPart.next = prev;
        else
            head = prev;
        lastNodeOfSubList.next = current;
        return head;
    }

    public static void main(String[]args) {

    }
}
