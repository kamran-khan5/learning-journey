#include <iostream>
using namespace std;

long find_lcm( long , long );
long find_gcd( long , long );

int main ()
{
	cout <<"\t FIND LCM OF TWO NUMBER \n\n\n\n";
	
	long num1,num2;
	cout<<"Enter first number = ";
	cin>>num1;
    
    cout<<"\nEnter second number = ";
	cin>>num2;
	
	cout << endl << endl << find_lcm(num1,num2) << " is LCM of " << num1 <<" and "<< num2 <<endl ;

	return 0;
}

long find_lcm( long num1, long num2)
{
	int lcm =num1 * num2 /  find_gcd (num1,num2);
	return lcm;
}

long find_gcd( long num1, long num2)
{
	long temp, gcd;
	
	(num1>num2)? temp = num1 : temp = num2;
	for (int i=1; i<=temp/2; i++)
	{
		if (num1==num2)
		{
			gcd=num1;
			break;
		}
		if (num1%i==0 && num2%i==0)
		{
			gcd=i;
		}
	}
	return gcd;
}
