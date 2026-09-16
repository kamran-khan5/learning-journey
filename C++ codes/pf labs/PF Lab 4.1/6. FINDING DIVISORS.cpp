#include<iostream>

using namespace std;

int main()
{
	cout<<"\t FINDING DIVISORS \n\n\n";
	
	int num;
	cout<<"Enter number to find its Divisors = ";
	cin>>num;
	
	cout<<endl;
	
	for(int i =1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			cout<<i<<endl;
		}
	}
	cout<<num<<endl;
}
