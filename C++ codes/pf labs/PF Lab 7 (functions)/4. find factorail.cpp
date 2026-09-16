#include <iostream>
using namespace std;

int find_factorial(int);

int main ()
{
	cout<<"\t FIND FACTORIAL NUMBER \n\n\n\n";

	int num;
	cout<<"Enter number to find its factorial = ";
	cin>>num;
	
    cout<<"\n\nFactorial  of '"<<num<<"' = " <<find_factorial(num);
	return 0;
}

int find_factorial(int num)
{
	int fact=1 ;
	for (int i=num; i>=1; i--)
	{
		fact*=i;
	}
	return fact;
 } 

