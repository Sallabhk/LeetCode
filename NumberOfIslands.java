public class NumberOfIslands {
  public int numberOfIslands(int[][] grid){
  int island=0;
  if(grid.length==0) return island;
  
  for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
      if(grid[i][j]=='1'){
        bfs(grid,i,j);
        island++;
      }
      }
   }
  return island;
  }
  
  void bfs(int[][] grid , int i, int j){
    if(i<0 || j<0|| i>grid.length-1 || j> grid.length-1){
    return;
    }
    if(grid[i][j]=='0') return;
    
    grid[i][j]='0';
    bf(grid,i+1,j);
    bf(grid,i-1,j);
    bf(grid,i,j+1);
    bf(grid,i,j-1);
    
  }

}

//Approach
// if the value at the particular index is '1' explore all the four dimensions and make to zero and then increase the island count
//base case if it is already '0' then return from the search
