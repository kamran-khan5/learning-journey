#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	cout<<"\tShowing result of expression.\n\n\n";
	int sum=0;
	cout<<"Enter expression:"<<endl;
	for(;;)
	{
		char ch=getche();
		if(ch==61)
		{
			break;
		}
		else if(ch==43)
		{
			sum=sum+(int)ch-48;
		}
		else if(ch==45)
		{
			sum=sum-(int)ch-48;
		}
		else if(ch==42)
		{
			sum=sum*((int)ch-48);
		}
		else if(ch==47)
		{
			sum=sum/((int)ch-48);
		}
		else
		{
			sum=sum+((int)ch-48);
		}
		
	}
	
	cout<<" "<<sum;
	
}

