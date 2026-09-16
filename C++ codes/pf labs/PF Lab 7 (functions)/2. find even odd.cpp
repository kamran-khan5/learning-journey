#include <iostream>
using namespace std;

void find_even_odd(int);


int main ()
{
	cout<<"\t FIND  EVEN / ODD  NUMBERS \n\n\n";
	
	int num;
	cout << "Enter number to find it even or odd =";
	cin>>num ;
	
	find_even_odd(num);
	
	return 0;
}

void find_even_odd (int num)
{
	if (num%2==0)
	{
		cout<<num<<" is even number.";
	}
	else
	{
		cout<<num<<" is odd number.";
	}
 } 
