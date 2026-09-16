#include <iostream>

using namespace std;

int fabonacci ( int num )
{
	if (num==0 || num==1)
	{
		return num;
	}
	return fabonacci(num-1) + fabonacci(num-2);
}

main ()
{
	cout<< "\t PRINTING FIBONACCI SERIES USING RECURSIION \n\n\n\n";
	
	int num;
	cout<<"Enter limit of Fabonacci series = ";
	cin>>num;
	cout<<fabonacci(num) << endl;

	return 0;
}

