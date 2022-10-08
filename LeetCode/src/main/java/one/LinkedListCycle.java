package main.java.one;

public class LinkedListCycle {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head){
        if (head.next == null) return false;

        ListNode one = head;
        ListNode two = head.next.next;

        while(one.next != null && two.next != null){
            if (one == two) return true;
            one = one.next;
            if(two.next == null) return false;
            two = two.next.next;
        }
        return false;
    }

}
