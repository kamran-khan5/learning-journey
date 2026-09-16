#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t FINDING 'LCM' OF 2 NUMBERS \n\n\n\n"; 
	
	int num1, num2, i, gcd, lcm;
	cout << "Enter first number = ";
	cin>> num1;
	
	cout << "\nEnter second number = ";
	cin>> num2;

    for (i=1 ; i<=num1 && i<=num2 ; i++)
    {
    	if (num1%i==0 && num2%i==0)
    	{
    		gcd=i;
		}
	}
	
	lcm=num1*num2/gcd;
	
	cout << endl << endl << lcm << " is LCM of " << num1 <<" and "<< num2 <<endl ;


	return 0;
}

