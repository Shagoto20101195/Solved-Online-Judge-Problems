import java.util.*;
import java.io.*;
public class Main
{
  static int mod = (int)1e9 + 7;
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    long [] memo = new long[(int)1e6+10];
    int n = read.nextInt();
    memo[0] = 1;
    for(int i = 1; i<=n; i++)
    {
      for(int j = 1; j<=6; j++)
      {
        if(i - j < 0)
        {
          break;
        }
        memo[i] = (memo[i] + memo[i-j]) % mod;
      }
    }
    
    System.out.println(memo[n]);
  }
}
