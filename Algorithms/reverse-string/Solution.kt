class Solution {
    fun reverseString(s: CharArray): Unit {
        var l = 0
        while(l < s.lastIndex -l){
            s[l] = s[s.lastIndex - l].also {s[s.lastIndex - l] = s[l]}
            l++
        }
    }
}
