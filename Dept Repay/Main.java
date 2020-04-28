#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float si,a,d,fs;
  cin>>p;
  cin>>r;
  cin>>t;
  si=(p*r*t)/100;
  a=p+si;
  d=(2.0/100.0)*si;
  fs=a-d;
  cout<<si<<"\n";
  cout<<a<<"\n";
  cout<<d<<"\n";
  cout<<fs<<"\n";
} 