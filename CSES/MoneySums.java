import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    int sum = 0;
    int [] arr = new int[n+1];
    
    for(int i = 1; i<=n; i++)
    {
      arr[i] = read.nextInt();
      sum += arr[i];
    }
    
    // Number of available coins for the sum
    boolean [][] dp = new boolean[n+1][sum+1];
    for(int i = 1; i<=n; i++)
    {
      dp[i][arr[i]] = true;
    }
    
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=sum; j++)
      {
        if(j - arr[i] < 0)
        {
          dp[i][j] = dp[i-1][j];
        }
        else if(dp[i-1][j])
        {
          dp[i][j] = true;
        }
        else if(dp[i][j-arr[i]] && dp[i-1][j-arr[i]])
        {
          dp[i][j] = true;
        }
      }
    }
    
    int count = 0;
    for(int i = 1; i<=sum; i++)
    {
      if(dp[n][i])
      {
        count++;
      }
    }
    
    System.out.println(count);
    for(int i = 1; i<=sum; i++)
    {
      if(dp[n][i])
      {
        System.out.print(i+" ");
      }
    }
    System.out.println();
  }
}
