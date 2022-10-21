class Solution {
    fun square(value: Int) = value * value

    fun sortedSquares(nums: IntArray): IntArray {
        val size = nums.size
        val result = IntArray(size)
        var start = 0
        var end = size -1

        for( p in size-1 downTo 0){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                result[p] = square(nums[start])
                start ++
            }else{
                result[p] = square(nums[end])
                end --
            }
        }
        return result
    }
}