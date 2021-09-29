import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args) throws IOException
  {
    Scanner read = new Scanner(System.in);
    
    int n = read.nextInt();
    HashSet<Integer> ans = new HashSet<>();
    for(int i = 0; i<n; i++)
    {
      ans.add(read.nextInt());
    }
    
    System.out.println(ans.size());
  }
}
