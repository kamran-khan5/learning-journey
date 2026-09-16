#include<iostream>

using namespace std;

int main()
{
	cout<<"\t SUM OF ALL MULTIPLE OF 7 FROM 1 TO 100 \n\n\n";
	int i,sum=0;
	
	for(i =1;i<=100;i++)
	{
		if(i%7==0)
		sum=sum+i;
	}
	    	cout<<"\nSum of all the multiples of 7 from 1 to 100 is 	="<<sum<<endl;
}
