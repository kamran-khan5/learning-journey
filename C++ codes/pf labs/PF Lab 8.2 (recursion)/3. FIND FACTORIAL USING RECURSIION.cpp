#include <iostream>

using namespace std;

int factorial ( int num )
{
	if (num==1)
	{
		return 1;
	}
	return num * factorial(num-1);
}

main ()
{
	cout<< "\t FIND FACTORIAL USING RECURSIION \n\n\n\n";
	
	int num;
	cout<<"Enter number to find its Factorial = ";
	cin>>num;
	cout<<endl<<endl<<"Factorial of numbers : "<<factorial(num) << endl;

	return 0;
}

