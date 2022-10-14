class Solution {
fun reverseWords(s: String): String {
    return s.split(" ").joinToString(" ") { reverseString(it) }
}

fun reverseString(s: String): String {
    var builder = StringBuilder()
    for( i in s.length-1 downTo 0){
        builder.append(s[i])
    }
    return builder.toString()
}

}