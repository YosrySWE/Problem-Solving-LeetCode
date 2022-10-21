class Solution {
    
    fun middleNode(head: ListNode?): ListNode? {
        var size = 0
        var middle: ListNode? = head
        var iterator: ListNode? = head
        while(iterator != null){
            size++
            iterator = iterator.next
            if(size % 2 == 0){
                middle = middle?.next
            }
        }
        return middle
    }


    // Recursive
    // fun middleNode(head: ListNode?): ListNode? {

    //     return rec_head(head = head, middle = head, size = 0)
    // }


    // fun rec_head(head: ListNode?, middle: ListNode?, size: Int) :ListNode?{
        
    //     if(head?.next == null){
    //         return middle
    //     }
    //     return rec_head(head?.next, if(size % 2 == 0) middle?.next else middle, size+1)

    // }


    // Two Pointers: Fast and Slow
    //  fun middleNode(head: ListNode?): ListNode? {
    //     var slow = head
    //     var fast = head
    //     while( fast != null && fast?.next != null){
    //         fast = fast?.next?.next
    //         slow = slow!!.next
    //     }

    //     return slow
    // }
}
