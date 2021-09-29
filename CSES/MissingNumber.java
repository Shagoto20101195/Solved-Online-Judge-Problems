import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[]args) throws IOException
  { 
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    long sum = 0;
    for(long i = 0; i<n-1; i++)
    {
      sum += read.nextLong();
    }
    
    System.out.println(n * (n + 1) / 2 - sum);
  }
}
