public class GridViewer
{
    public static void view(init[][] grid)
    {
       for(int i = 0; i < grid.length; i++)
        {
            for(int i = 0; i < grid.length; i++)
 33             {
 34                 for(int j = 0; j < grid[i].length; j++)
 35                 {
 36                     switch(grid[i][j])
 37                     {
 38                         case Maze.EMPTY:
 39                             System.out.print(" ");
 40                             break;
 41 
 42                         case Maze.WALL:
 43                             System.out.print("##");
 44                             break;
 45 
 46                         case Maze.START:
 47                             System.out.print("^^");
 48                             break;
 49 
 50                         case Maze.END:
 51                             System.out.print("$$");
 52                             break;
 53 
 54                         case Maze.VISITED:
 55                             System.out.print("..");
 56                             break;
 57 
 58                         default:
 59                             throw new AssertionError();
 60                     }
 61 
 62                 }


        }
        System.out.println();
}

