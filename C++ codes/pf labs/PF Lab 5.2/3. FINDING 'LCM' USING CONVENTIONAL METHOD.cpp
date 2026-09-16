#include <iostream>

using namespace std;

main ()
{
	cout<<"\t FINDING 'LCM' USING CONVENTIONAL METHOD \n\n\n\n";
	
	int num1, num2;
	cout << "Enter first number = ";
	cin>> num1;
	
	cout << "\nEnter second number = ";
	cin>> num2;
	
	int temp1=num1, temp2=num2;
	int i, lcm=1;
	
    for (i=2; num1!=1 && num2!=1; )
	{
		if (num1%i==0 && num2%i==0)
			{
			    lcm=lcm*i;
			    num1=num1/i;
			    num2=num2/i;
			}
			
		else if (num1%i==0)
			{
				lcm=lcm*i;
			    num1=num1/i;
			}
			
		else if (num2%i==0)
			{
				lcm=lcm*i;
			    num2=num2/i;
			}
		else
			{
				i++;
			}	
	}
	
	cout << endl << endl << lcm << " is LCM of " << temp1 <<" and "<< temp1 <<endl ;


	return 0;
}

