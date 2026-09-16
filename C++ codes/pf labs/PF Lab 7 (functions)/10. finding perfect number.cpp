#include <iostream>
using namespace std;

void find_perfect_number(long);

int main ()
{
	cout<<"\t FIND PERFECT NUMBERS IN REQUIRED RANGE \n\n\n";
	
	int lower_limit, higher_limit;
	
	cout<<"Enter lower limit = ";
	cin>>lower_limit;
	
	cout<<"\nEnter higher limit = ";
	cin>>higher_limit;
	
	cout<<endl;
	
	for (int i= lower_limit; i <=higher_limit; i++)
	{
		find_perfect_number(i);
	}
	return 0;
}

void find_perfect_number(long num)
{
	long divisor=0;
	for (int i=1; i<num ;i++)
	{
		if (num%i==0)
		{
			divisor+=i;
		}
	}
	if (num==divisor)
	{
		cout<<num<< " is Perfect number.\n";
	}

}

