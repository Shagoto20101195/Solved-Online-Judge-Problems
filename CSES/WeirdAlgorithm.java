//Written by Shagoto
import java.util.*;
import java.io.*;
public class WeirdAlgorithm
{  
  public static void main(String[]args) throws IOException
  { 
    Scanner read = new Scanner(System.in);
    
    long n = read.nextLong();
    System.out.print(n+" ");
    while(n != 1)
    {
      if(n % 2 == 0)
      {
        n /= 2;
        System.out.print(n+" ");
      }
      else
      {
        n = (n * 3) + 1;
        System.out.print(n+" ");
      }
    }
  }
}
