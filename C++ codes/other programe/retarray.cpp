#include <iostream>
#include <string>
# include <fstream>
using namespace std;

int * reta(int a[])
{
	for (int i=0;i<5;i++)
	{
		a[i]*=2;
	}
	
	return a;
}
int find (string s11, string s2)
{
	cout<<s11<<"  "<<s2<<endl;
}
int main ()
{

int b[] = {1,2,3,4,5,6,7,8,9};
int *c = reta(b);

fstream f ;
f.open("D:\\mytext.jamshed",ios::app|ios::in);
string s;
f<<" Aoa, this is second"<<endl;
f<<" I am doing it "<<endl;
f.seekg(0,ios::beg);
string all ="";
while (getline(f,s))
all+=s;
f.close();
cout<<all;

for (int i=0;i<9;i++)
{
//	cout <<b[i] <<"   " <<c[i]<<endl;
	
}
	return 0;
}

