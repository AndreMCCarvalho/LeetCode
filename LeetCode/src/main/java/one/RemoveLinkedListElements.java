package one;

public class RemoveLinkedListElements {

    public static void main(String[] args) {

    }

    public ListNode removeElemets(ListNode head, int val){
        if (head == null ) return null;

        while (head != null && head.val == val){
            head = head.next;
        }

        ListNode start = head;


        while (head != null && head.next != null){
            if (head.next.val == val){
                head.next = head.next.next;
                continue;
            }
            head = head.next;
        }

        return start;
    }

}
