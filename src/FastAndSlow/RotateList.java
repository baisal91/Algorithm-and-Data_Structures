package FastAndSlow;



class RotateList {

    public static ListNode rotate(ListNode head, int rotations) {
        // TODO: Write your code here
        if(head == null || rotations <=0 || head.next == null){
            return head;
        }


        ListNode curr = head;
        int length = 1;

        while(curr.next != null){
            curr = curr.next;
            length++;
        }

        curr.next = head;


        ListNode temp = head;

        rotations = rotations % length;
        int skiplength = length - rotations;

        for(int i=0; i<skiplength-1; i++){
            temp = temp.next;
        }



        head = temp.next;
        temp.next = null;


        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode result = RotateList.rotate(head, 3);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
