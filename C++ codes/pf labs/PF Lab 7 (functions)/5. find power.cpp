#include <iostream>
using namespace std;

double find_power ( double, double );

int main ()
{
	cout<<"\t FIND POWER OF NUMBERS \n\n\n\n";
	double base, exponent;
	
	cout <<"Enter Number or Base = ";
	cin>> base;
	
	cout <<"\nEnter Exponent or Power = ";
	cin>> exponent;

    cout << "\nAnswer = "<<find_power( base, exponent) << endl;

	return 0;
}

double find_power ( double base, double exponent)
{
	double result=1;
	for (int i=1; i<=exponent; i++)
	{
		result*=base;
	}
	return result;
}

