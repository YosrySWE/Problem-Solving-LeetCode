class Solution {
       fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        var maximum = 0

        for(r in grid.indices)
            for (c in 0 until grid[0].size){
                val cur = island(grid, r, c)
                maximum = cur.coerceAtLeast(maximum)
            }

        return maximum
    }

    fun island(grid: Array<IntArray>, i: Int, j: Int): Int{

        if(i !in grid.indices || j !in 0 until grid[0].size ) return 0
        if(grid[i][j] == 0) return 0

        grid[i][j] = 0
        
        return 1 + island(grid, i +1, j) +
                island(grid, i -1, j) +
                island(grid, i, j + 1) +
                island(grid, i, j - 1)
    }
}