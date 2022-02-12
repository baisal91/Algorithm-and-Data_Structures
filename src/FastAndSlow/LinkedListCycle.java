package FastAndSlow;

import java.util.List;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        // TODO: Write your code here
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
      return false;
    }

    public static int hasLength(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return foundLength(slow);
            }
        }
        return -1;
    }

    private static int foundLength(ListNode slow){
        int length = 0;
        ListNode curr = slow;
       do{
           curr = curr.next;
           length++;


       }while (curr != slow);

        return length;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList cycle length: " + LinkedListCycle.hasLength(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList cycle length: " + LinkedListCycle.hasLength(head));
    }
}
