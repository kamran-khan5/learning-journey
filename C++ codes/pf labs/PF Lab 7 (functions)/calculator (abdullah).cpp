#include<iostream>
using namespace std;
double add(double,double);
double sub(double,double);
double div(double,double);
double mul(double,double);
double result(double ,double , char);
double print(double);


int main()
{
double a;
double b;
char c;

for(;;)
	{
		int ch;
		cout<<"The result is :	"<<print(result(a,b,c))<<endl<<endl<<endl;
		cout<<"Wounld u want to continue ?"<<endl;
		cout<<"Press 1 for continue:	";
		cin>>ch;
		cout<<endl<<endl<<endl;
	
		if(ch!=1)
			{
				break;
			}
	}
	


}


double add(double a,double b)
{
	int res=a+b;
	return res;
}
double sub(double a,double b)
{
	int res=a-b;
	return res;
}
double div(double a,double b)
{
	int res=a/b;
	return res;
}
double mul(double a,double b)
{
	int res=a*b;
	return res;
}
double result(double a,double b , char c)
{
	if(c=='+')
	{
	double add(double a,double b);
	return add(a,b);
	}
	else if(c=='-')
	{
	double sub(double a,double b);
	return sub(a,b);
	}
	else if(c=='/')
	{
	double div(double a,double b);
	return div(a,b);
	}
	else if(c=='*')
	{
	double mul(double a,double b);
	return mul(a,b);
	}
}
double print(double)
{
double a;
double b;
char c;
cout<<"Enter first number:	";
cin>>a;

cout<<"Enter second number:	";
cin>>b;

cout<<"Enter + for Addition\nEnter - for subtraction\nEnter / for division\nEnter * for multipication"<<endl;
cin>>c;

return result(a, b, c);
}
