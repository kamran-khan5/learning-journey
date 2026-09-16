#include<iostream>

using namespace std;

int main()
{
	cout<<"\t FINDING POWER \n\n\n";
	
	long int num1, num2, pow=1, x;
	
	cout<<"\nEnter the base value = ";
	cin>>num1;
	cout<<"\nEnter the exponent value = ";
	cin>>num2;
	
	for(int i=1;i<=num2;i++)
	{
		pow = pow * num1;
		
	}
	
	cout<<"\nResult is 	=" << pow << endl;
}
