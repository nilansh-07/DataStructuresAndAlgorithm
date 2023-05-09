public class ListNode {
    
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        // Create n nodes as manay as we want

        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(32);
        ListNode l3 = new ListNode(44);
        ListNode l4 = new ListNode(59);

        // Link the nodes

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;

        // Print values

        ListNode ptr = l1;
        System.out.print("The Elements of the Linked List are:");
        while (ptr != null) {
            System.out.print(" " + ptr.val);
            ptr = ptr.next;
        }
    }
}
