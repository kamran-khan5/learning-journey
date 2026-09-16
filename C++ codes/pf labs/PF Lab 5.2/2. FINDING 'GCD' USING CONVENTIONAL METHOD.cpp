#include <iostream>
using namespace std;

int main()
{
	cout<<"\t FINDING 'GCD' USING CONVENTIONAL METHOD \n\n\n\n";
	
	int i, temp, num1, num2, gcd;
	
	cout << "Enter first number =";
	cin >> num1;
	
	cout << "\nEnter second number =";
	cin >> num2;
	
	if (num1>num2)
	{
		temp=num1/2;
	}
	else if (num2>num1)
	{
		temp=num2/2;
	}
	else if (num1==num2)
	{
		temp=num1;
	}
		
	
	for (i=temp ; i>=1 ; i--)
	{
		if (num1%i==0 && num2%i==0)
		{
			gcd=i;
			break;
		}
	}
	cout << endl << endl << "GCD = "<<gcd << endl ;


	return 0;
}

