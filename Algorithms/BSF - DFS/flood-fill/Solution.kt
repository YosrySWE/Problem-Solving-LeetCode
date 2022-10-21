class Solution {
   fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        val rowLen = image.size
        val colLen = image[0].size

        val startColor = image[sr][sc]
        if(image[sr][sc] == color) return image

        val queue = ArrayDeque<Pair<Int,Int>>()
        queue.addFirst(Pair(sr,sc))

        while ( queue.size > 0){
            val node = queue.removeLast()
            image[node.first][node.second] = color

            val array = arrayListOf(
                Pair(node.first -1, node.second),
                Pair(node.first +1, node.second),
                Pair(node.first, node.second -1),
                Pair(node.first, node.second +1)
                )
            for((r,c) in array){
                if(r in 0 until rowLen && c in 0 until colLen && image[r][c] == startColor){
                    queue.addLast(Pair(r,c))
                }
            }
        }

        return image
    }
   
}