#include <iostream>

using namespace std;

//globle variable.
int i=0;

void print_number (int num)
{
	if (num==1)
	{
		return;
	}
    else if(num%2==0)
	{
		cout<<num<<", ";
		print_number(num/2);
	}
	else
	{
		cout<<num<<", ";
		print_number(num*3+1);
	}
}

main ()
{
	cout<< "\t PRINTING HAILSTONE SEQUENCE USING RECURSIION \n\n\n\n";
	
	int num;
	cout<<"Enter to print hailstone sequence = ";
	cin>>num;
	
   	print_number(num);

	return 0;
}

