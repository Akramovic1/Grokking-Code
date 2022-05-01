import java.util.*;

public class Main {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, next;
        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[]args) {

    }
}
