import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    String s = read.nextLine();
    int ans = 1;
    int streak = 1;
    char last = s.charAt(0);
    
    for(int i = 1; i<s.length(); i++)
    {
      if(s.charAt(i) == last)
      {
        streak++;
        ans = Math.max(ans, streak);
      }
      else
      {
        streak = 1;
        last = s.charAt(i);
      }
    }
    
    System.out.println(ans);
  }
}
