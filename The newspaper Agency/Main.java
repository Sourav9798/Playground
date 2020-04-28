#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y,cp=0,sp=0,p=0;
  cin>>w;
  cin>>x;
  cin>>y;
  cp=(w*y)+100;
  sp=(w*x);
  p=sp-cp;
  cout<<p;
}