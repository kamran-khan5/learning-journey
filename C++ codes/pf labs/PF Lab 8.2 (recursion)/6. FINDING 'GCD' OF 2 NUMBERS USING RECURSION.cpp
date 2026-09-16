#include <iostream>

using namespace std;

int find_gcd(int num1, int num2)
{
	if ( num1==num2)
    {
    	return num1;
	}
	
	( num1>num2 ) ? num1-=num2 : num2-=num1 ;
	return find_gcd ( num1 , num2 );
}

main ()
{
	cout<<"\t FINDING 'GCD' OF 2 NUMBERS USING RECURSION \n\n\n\n";
	
	int num1, num2;
	cout << "Enter first number = ";
	cin>> num1;
	
	cout << "\nEnter second number = ";
	cin>> num2;
	
	cout<<"\n\n GCD of '"<< num1 <<"' and '"<< num2 <<"' is : " << find_gcd( num1, num2 ) << endl;


	return 0;
}

