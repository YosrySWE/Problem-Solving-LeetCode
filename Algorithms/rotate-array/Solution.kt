import kotlin.collections.*

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        for(repeatIndex in 0 until k){
        for(index in nums.indices){
            val temp = nums[nums.size -1]
            nums[nums.size -1] = nums[index]
            nums[index] = temp
        }
    }
    }
}