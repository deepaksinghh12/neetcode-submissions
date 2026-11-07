class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) ->
                Integer.compare(a.val, b.val));

        // Insert the first node of every list
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!pq.isEmpty()) {

            // Get smallest node
            ListNode node = pq.poll();

            // Attach to result
            curr.next = node;
            curr = curr.next;

            // Insert next node from same list
            if (node.next != null) {
                pq.add(node.next);
            }
        }

        curr.next = null;

        return dummy.next;
    }
}