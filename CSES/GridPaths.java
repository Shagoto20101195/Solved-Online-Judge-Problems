import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int mod = (int)1e9 + 7;
    int n = read.nextInt();
    read.nextLine();
    char [][] grid = new char[n][n];
    long [][] dp = new long[n][n];
    
    for(int i = 0; i<n; i++)
    {
      grid[i] = read.nextLine().toCharArray();
    }
    
    dp[0][0] = 1;
    int index = 1;
    while(index < n && grid[0][index] != '*')
    {
      dp[0][index] = 1;
      index++;
    }
    
    index = 1;
    while(index < n && grid[index][0] != '*')
    {
      dp[index][0] = 1;
      index++;
    }
    
    for(int i = 1; i<n; i++)
    {
      for(int j = 1; j<n; j++)
      {
        if((grid[i-1][j] == '*' && grid[i][j-1] == '*') || grid[i][j] == '*')
        {
          continue;
        }
        else
        {
          dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % mod;
        }
      }
    }
    
    if(grid[0][0] == '*')
    {
      System.out.println(0);
    }
    else
    {
      System.out.println(dp[n-1][n-1]);
    }
  }
}
