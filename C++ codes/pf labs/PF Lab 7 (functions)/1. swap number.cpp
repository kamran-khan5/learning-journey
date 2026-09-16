#include <iostream>
using namespace std;

void swap_number (int &a, int &b)
{
	int c=a;
	a=b;
	b=c;
} 

int main ()
{
	cout<<"\t SWAP NUMBERS \n\n\n\n";
	
	int num1, num2 ;
	cout<<"Enter first number = ";
	cin >> num1;
	
	cout<<"\nEnter second number = ";
	cin >> num2;
	
	cout <<"\n\nBefore swaping:\nFirst number= "<<num1<<"\nSecond number = "<<num2;
	
	swap_number(num1,num2);
	
	cout <<"\n\nAfter swaping:\nFirst number= "<<num1<<"\nSecond number = "<<num2;
	
	return 0;
}


