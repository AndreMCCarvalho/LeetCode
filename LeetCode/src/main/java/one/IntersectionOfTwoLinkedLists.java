package main.java.one;

import java.util.*;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

    }

    public ListNode getIntersectNode(ListNode headA, ListNode headB){
        if (headA == null && headB == null) return null;
        if (headA == headB) return headA;

        Deque<ListNode> memA = new ArrayDeque<>();
        Deque<ListNode> memB = new ArrayDeque<>();

        ListNode sA = headA;
        ListNode sB = headB;

        while(sA.next != null && sB.next != null){
            if (sA == sB) return sA;
            if (memA.contains(sB)) return sB;
            if (memB.contains(sA)) return sA;
            memA.add(sA);
            memB.add(sB);
            sA = sA.next;
            sB = sB.next;
        }

        while (sA.next != null){
            if(memB.contains(sA)) return sA;
            memA.add(sA);
            sA = sA.next;
        }

        memA.add(sA);

        while (sB.next != null){
            if(memA.contains(sB)) return sB;
            memB.add(sB);
            sB = sB.next;
        }

        memB.add(sB);

        return memA.peekLast() == memB.peekLast() ? memA.getLast() : null;
    }

    public ListNode betterSolution(ListNode headA, ListNode headB){
        int lenA = length(headA), lenB = length(headB);

        while (lenA > lenB){
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA){
            headB = headB.next;
            lenB--;
        }

        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    private int length(ListNode node){
        int i = 0;
        while(node != null){
            i++;
            node = node.next;
        }
        return i;
    }
}
