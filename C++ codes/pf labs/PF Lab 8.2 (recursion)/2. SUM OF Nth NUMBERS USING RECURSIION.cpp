#include <iostream>

using namespace std;

int number_sum ( int num )
{
	if (num==0)
	{
		return 0;
	}
	return num + number_sum(num-1);
}

main ()
{
	cout<< "\t SUM OF Nth NUMBERS USING RECURSIION \n\n\n\n";
	
	int num;
	cout<<"Enter limit how many number do you want to SUM = ";
	cin>>num;
	cout<<endl<<endl<<"Sum of numbers : "<<number_sum(num) << endl;

	return 0;
}

