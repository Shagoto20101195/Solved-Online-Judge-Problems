#include <bits/stdc++.h>
  using namespace std;
typedef long long int ll;
 
int main()
{
  int n;
  cin>>n;
  if(n < 4 && n != 1)
  {
    cout<<"NO SOLUTION";
  }
  else if(n % 2 == 0)
  {
    for(int i = 2; i<=n; i+=2)
    {
      cout<<i<<" ";
    }
    for(int i = 1; i<=n; i+=2)
    {
      cout<<i<<" ";
    }
  }
  else
  {
    for(int i = 1; i<=n; i+=2)
    {
      cout<<i<<" ";
    }
    for(int i = 2; i<=n; i+=2)
    {
      cout<<i<<" ";
    }
  }
}
