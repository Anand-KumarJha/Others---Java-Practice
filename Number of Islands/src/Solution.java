class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] a = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1' && a[i][j] == false){
                    count++;
                    checkIsland(grid,a,i,j);
                }
            }
        }

        return count;
    }

    public void checkIsland(char[][] grid, boolean[][] a, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length||
                grid[i][j] == '0' || a[i][j] == true){
            return;
        }
        a[i][j] = true;
        checkIsland(grid,a,i+1,j);
        checkIsland(grid,a,i-1,j);
        checkIsland(grid,a,i,j+1);
        checkIsland(grid,a,i,j-1);
    }
}