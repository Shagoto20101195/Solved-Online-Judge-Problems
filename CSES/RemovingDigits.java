import java.util.*;
import java.io.*;
public class Main
{
  static int inf = (int)1e9;
  static int [] memo = new int[1000005];
  static int dp(int n)
  {
    for(int i = 1; i<=9; i++)
    {
      memo[i] = 1;
    }
    
    for(int i = 10; i<=1000000; i++)
    {
      int temp = i;
      int digit = 0;
      while(temp > 0)
      {
        digit = Math.max(digit, temp % 10);
        temp /= 10;
      }
      
      memo[i] = 1 + memo[i - digit];
    }
    
    return memo[n];
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    System.out.println(dp(n));
  }
}
