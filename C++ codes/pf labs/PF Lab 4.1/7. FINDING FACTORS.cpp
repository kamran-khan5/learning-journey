#include<iostream>

using namespace std;

int main()
{
	cout<<"\t FINDING FACTORS \n\n\n";
	
	int num, limit;
	cout<<"Enter number to find its factors = ";
	cin>>num;
	
	cout<<"\nEnter number for limit of finding factor = ";
	cin>>limit;
	
	cout<<endl;
	for(int i=1; i<=limit ;i++)
	{
		cout<<num*i<<endl;
	}
}
