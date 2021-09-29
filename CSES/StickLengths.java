import java.util.*;
import java.io.*;
public class Main
{  
  public static void main(String[]args) throws IOException
  {  
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    long [] arr = new long[n];
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextLong();
    }
    
    Arrays.sort(arr);
    long ans = 0;
    for(int i = 0; i<n; i++)
    {
      ans += Math.abs(arr[i] - arr[n / 2]);
    }
    
    System.out.println(ans);
  }
}
