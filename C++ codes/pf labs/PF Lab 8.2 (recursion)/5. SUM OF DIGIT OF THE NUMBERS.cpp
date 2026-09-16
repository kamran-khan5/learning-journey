#include <iostream>

using namespace std;

int digit_sum ( int num )
{
	if (num==0)
	{
		return 0;
	}
	return num%10 + digit_sum( num / 10 );
}

main ()
{
	cout<< "\t SUM OF DIGIT OF THE NUMBERS USING RECURSIION \n\n\n\n";
	
	int num;
	cout<<"Enter number to find Sum of its Digit = ";
	cin>>num;
	cout<<endl<<endl<<"Sum of numbers : "<<digit_sum(num) << endl;

	return 0;
}
