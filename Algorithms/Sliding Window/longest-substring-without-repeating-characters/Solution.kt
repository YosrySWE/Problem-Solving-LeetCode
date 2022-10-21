class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
    var left = 0
    var right = 0
    var result = 0

    val chars = Array(128) { 0 }
    while(right < s.length){
        val ch = s[right]
        chars[ch.toInt()]++

        while(chars[ch.toInt()] > 1){
            chars[s[left].toInt()]--
            left++
        }

        result = result.coerceAtLeast(right - left + 1)


        right ++
    }





    return result
}

}