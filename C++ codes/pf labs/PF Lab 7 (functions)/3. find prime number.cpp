#include <iostream>
using namespace std;

void find_prime_no(long);

int main ()
{
	cout<<"\t FIND PRIME NUMBER \n\n\n\n";
	
	int num;
	cout << "Enter number to find number is prime or not =";
	cin>>num ;
	
	find_prime_no(num);
	
	return 0;
}

void find_prime_no(long num)
{
	for (int i=2; i<=num/2;i++)
	{    
		if (num%i==0)
		{
			cout << endl << endl << num<<" is not prime number." << endl ;
			return;
		}	
	}
	
		cout << endl << endl << num << " is prime number."<< endl ;
}
