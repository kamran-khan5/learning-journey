#include<iostream>

using namespace std;

int main()
{
	cout<<"\t FIBONACCI SERIES \n\n\n";
	
	int i, f, f1=1, f2=1, row;
	
	cout<<"Enter rows number = ";
	cin>>row;
	
	cout<<f1<<endl<<f2;
	
	for(i=2;i<row;i++)
	{
		f=f1+f2;
		f1=f2;
		f2=f;
		
		cout<<"\n"<<f;
	}
}
