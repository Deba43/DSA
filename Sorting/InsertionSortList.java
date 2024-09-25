package Sorting;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head, next = null;
        // l is a fake head
        ListNode l = new ListNode(0);

        while (curr != null) {
            next = curr.next;

            ListNode p = l;
            while (p.next != null && p.next.val < curr.val)
                p = p.next;

            // insert curr between p and p.next
            curr.next = p.next;
            p.next = curr;
            curr = next;
        }

        return l.next;
    }

    public static void main(String[] args) {
        // Create a linked list: [4 -> 2 -> 1 -> 3]
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Sort the linked list
        SortList sorter = new SortList();
        ListNode sortedHead = sorter.sortList(node1);

        // Print the sorted linked list
        System.out.print("Sorted List: ");
        ListNode current = sortedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

}
