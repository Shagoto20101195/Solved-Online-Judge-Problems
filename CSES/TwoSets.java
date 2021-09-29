import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner read = new Scanner(System.in);
    
    int inp = read.nextInt();
    long n = (long)inp;
    
    long sum = n*(n+1) / 2;
    
    if(sum % 2 == 1)
    {
      System.out.println("NO");
    }
    else
    {
      long half = sum / 2;
      int t1 = 0;
      int t2 = 0;
      
      if(inp % 2 == 1)
      {
        t1 = inp / 2 + 1;
        t2 = inp / 2;
      }
      else
      {
        t1 = inp / 2;
        t2 = inp / 2;
      }
      
      long [] arr1 = new long[t1];
      long [] arr2 = new long[t2];
      
      arr1[0] = 1;
      for(int i = 1; i<t1; i++)
      {
        arr1[i] = arr1[i-1] + 2;
      }
      
      arr2[0] = 2;
      for(int i = 1; i<t2; i++)
      {
        arr2[i] = arr2[i-1] + 2;
      }
      
      long s1 = (2*1 + ((long)t1-1)*2) * (long)t1 / 2;
      long s2 = (2*2 + ((long)t2-1)*2) * (long)t2 / 2;
      long dif = Math.abs(s1 - half);
      long count = 0;
      int ind1 = t1 - 1;
      int ind2 = t2 - 1;
      while(count < dif)
      {
        long temp = arr1[ind1];
        arr1[ind1] = arr2[ind2];
        arr2[ind2] = temp;
        
        count++;
        ind1--;
        ind2--;
      }
      
      System.out.println("YES");
      
      System.out.println(arr1.length);
      for(int i = 0; i<t1; i++)
      {
        output.write(arr1[i]+" ");
      }
      output.flush();
      System.out.println();
      
      System.out.println(arr2.length);
      for(int i = 0; i<t2; i++)
      {
        output.write(arr2[i]+" ");
      }
      output.flush();
      System.out.println();
    }
  }
}
