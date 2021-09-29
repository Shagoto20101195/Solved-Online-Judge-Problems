import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int mod = (int)1e9 + 7;
    long ans = 1;
    int n = read.nextInt();
    for(int i = 1; i<=n; i++)
    {
      ans = ans * 2 % mod;
    }
    
    System.out.println(ans);
  }
}
