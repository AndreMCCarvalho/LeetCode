package one;

public class MergeTwoSortedLists
{

    public static void main(String[] args)
    {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        ListNode start = new ListNode();
        ListNode current = start;

        while(list1 != null || list2 != null){
            if (list1 == null){
                current.val = list2.val;
                current.next = list2.next;
                break;
            }
            else if(list2 == null){
                current.val = list1.val;
                current.next = list1.next;
                break;
            }
            else{
                if(list1.val < list2.val){
                    current.val = list1.val;
                    current.next = new ListNode();
                    current = current.next;
                    list1 = list1.next;
                }
                else{
                    current.val = list2.val;
                    current.next = new ListNode();
                    current = current.next;
                    list2 = list2.next;
                }
            }
        }
        return start;
    }

    private class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){ this.val = val; }
        ListNode(int val, ListNode next){ this.val = val; this.next = next;}
    }
}
