class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var indexZero = 0
        var index = 0
        while(index < nums.size){
            if(nums[index] == 0) index ++
            else{
                val temp = nums[index]
                nums[index] = nums[indexZero]
                nums[indexZero] = temp
                index++
                indexZero++
            }
        }
    }
}