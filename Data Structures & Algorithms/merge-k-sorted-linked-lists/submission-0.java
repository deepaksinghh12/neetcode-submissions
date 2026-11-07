class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        List<ListNode> nodes = new ArrayList<>();

        for (ListNode head : lists) {
            while (head != null) {
                nodes.add(head);
                head = head.next;
            }
        }

        nodes.sort((a, b) -> Integer.compare(a.val, b.val));

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (ListNode node : nodes) {
            curr.next = node;
            curr = curr.next;
        }

        curr.next = null;

        return dummy.next;
    }
}