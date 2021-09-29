import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    long ans = 0;
    int n = read.nextInt();
    long [] arr = new long[n];
    
    for(int i = 0; i<n; i++)
    {
      arr[i] = read.nextLong();
    }
    
    for(int i = 1; i<n; i++)
    {
      if(arr[i] < arr[i-1])
      {
        ans += arr[i-1] - arr[i];
        arr[i] = arr[i-1];
      }
    }
    
    System.out.println(ans);
  }
}
