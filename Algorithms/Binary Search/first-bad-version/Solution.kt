/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var low = 1;
        var high = n
        var result = n
        while(low <= high){
            var mid = low + (high - low)/2

            if(isBadVersion(mid)){
                result = mid
                high = mid -1
            }else{
                low = mid +1

            }
        }
        return result
	}
}