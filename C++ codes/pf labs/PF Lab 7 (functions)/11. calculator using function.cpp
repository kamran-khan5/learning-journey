#include <iostream>
using namespace std;

float addition (float, float);
float subtraction (float, float);
float multiplication (float, float);
float divison (float, float);

int main ()
{
	cout << "\t SIMPLE CALCULATOR \n\n\n\n";
	float num1, num2, result;
	char op;
	
	cout << "Enter first number = ";
	cin>> num1;
	
	cout << "Enter Arthematic operator = ";
	cin>> op;
	
	cout << "Enter second number = ";
	cin>> num2;
	
	switch(op)
	{
		case '+':
			result = addition(num1,num2);
			break;
			
		case '-':
			result = subtraction(num1,num2);
			break;
			
		case '*':
			result = multiplication(num1,num2);
			break;
			
		case '/':
			result = divison(num1,num2);
			break;
			
		default:
		cout<<"\nERROR... invalid input.\n";
		break;				
			
	}
	cout<<"Result = "<<result;

	return 0;
}

float addition (float num1, float num2)
{
	return num1+num2;
}

float subtraction (float num1, float num2)
{
	return num1-num2;	
}

float multiplication (float num1, float num2)
{
	return num1*num2;	
}

float divison (float num1, float num2)
{
	return num1/num2;
}
