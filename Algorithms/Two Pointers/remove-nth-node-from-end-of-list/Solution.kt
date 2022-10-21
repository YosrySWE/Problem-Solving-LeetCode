class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var fast = head
        var slow = head
        for (i in 0 .. n-1){
            fast = fast?.next
        }
        if (fast == null) return head?.next;
        while(fast?.next != null){
            slow = slow?.next
            fast = fast?.next
        }
        slow?.next = slow?.next?.next
        
        return head
    }
}