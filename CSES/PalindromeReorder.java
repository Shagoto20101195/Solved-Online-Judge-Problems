import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner read = new Scanner(System.in);
    
    char [] ch = read.nextLine().toCharArray();
    int [] freq = new int[26];
    
    for(int i = 0; i<ch.length; i++)
    {
      freq[ch[i] % 65]++;
    }
    
    int count = 0;
    for(int i = 0; i<26; i++)
    {
      if(freq[i] % 2 == 1)
      {
        count++;
      }
    }
    
    if(count > 1)
    {
      output.write("NO SOLUTION");
      output.flush();
    }
    else
    {
      for(int i = 0; i<26; i++)
      {
        if(freq[i] % 2 == 0 && freq[i] > 0)
        {
          for(int j = 1; j<=freq[i] / 2; j++)
          {
            output.write((char)(i + 65));
          }
        }
      }
      
      for(int i = 0; i<26; i++)
      {
        if(freq[i] % 2 == 1)
        {
          for(int j = 1; j<=freq[i]; j++)
          {
            output.write((char)(i + 65));
          }
          break;
        }
      }
      
      for(int i = 25; i>=0; i--)
      {
        if(freq[i] % 2 == 0 && freq[i] > 0)
        {
          for(int j = 1; j<=freq[i] / 2; j++)
          {
            output.write((char)(i + 65));
          }
        }
      }
      
      output.flush();
      System.out.println();
    }
  }
}
