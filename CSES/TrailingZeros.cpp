#include <bits/stdc++.h>
  using namespace std;
typedef long long int ll;
 
int main()
{
  ll n;
  cin>>n;
 
  ll c1 = 2;
  ll c2 = 5;
  ll count1 = 0;
  ll count2 = 0;
  while(c1 <= n)
  {
      count1 += n / c1;
      c1 *= 2;
  }
  while(c2 <= n)
  {
      count2 += n / c2;
      c2 *= 5;
  }
 
   cout<<min(count1, count2);
}
