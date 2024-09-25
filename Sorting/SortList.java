package Sorting;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Step 1: Cut the list into two halves
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        // Step 2: Sort each half
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        // Step 3: Merge the two halves
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If either list still has elements left, append them
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    // Main method to test the sortList function
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
