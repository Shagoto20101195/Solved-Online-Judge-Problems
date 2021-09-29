// May The Father of Understanding Guide Us
import java.util.*;
import java.io.*;
public class Main
{
  static int nmax = (int)1e9;
  static int mod = (int)1e9 + 7;
  static int n, x;
  static int [] arr;
  static int [] memo;
  static int dp(int x)
  {
    
    for(int i = 1; i<=x; i++)
    {
      for(int j = 0; j<n; j++)
      {
        if(i - arr[j] < 0)
        {
          continue;
        }
        
        memo[i] = Math.min(memo[i - arr[j]] + 1, memo[i]);
      }
    }
     
    return memo[x];
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    n = read.nextInt();
    x = read.nextInt();
    arr = new int[n];
    memo = new int[x+10];
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextInt();
    }
    
    Arrays.fill(memo, nmax);
    memo[0] = 1;
    int ans = dp(x);
    
    if(ans >= nmax)
    {
      System.out.println(-1);
    }
    else
    {
      System.out.println(ans-1);
    }
  }
}
