#include <iostream>

using namespace std;

int find_power(int base, int exponent)
{
	if ( exponent==0)
    {
    	return 1;
	}
	
	return base * find_power(base, exponent-1);
} 

main ()
{
	cout<<"\t FINDING POWER USING RECURSION \n\n\n\n";
	
	int base, exponent;
	cout << "Enter base number = ";
	cin>> base;
	
	cout << "\nEnter exponent number = ";
	cin>> exponent;
	
	cout<<"\n\n Power is : " << find_power( base, exponent ) << endl;


	return 0;
}

