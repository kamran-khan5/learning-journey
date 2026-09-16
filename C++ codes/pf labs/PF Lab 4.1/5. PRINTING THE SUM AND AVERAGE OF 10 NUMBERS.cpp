#include<iostream>

using namespace std;

int main()
{
	cout<<"\t PRINTING THE SUM AND AVERAGE OF 10 NUMBERS \n\n";
	int num,sum=0,avg;
	
	for(int i=1;i<=10;i++)
	{
		cout<<"\nEnter "<<i<<" number"<<endl;
		
		cin>>num;
		sum+=num;
		
	}
	
	
	cout<<"\n\nSum of all anumbers is 	="<<sum<<endl;
	
	avg=sum/10;
	
	cout<<"\n\nAverage of all numbers 	="<<avg<<endl;
}
