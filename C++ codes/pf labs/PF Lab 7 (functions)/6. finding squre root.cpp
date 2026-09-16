#include <iostream>
using namespace std;

double squre_root(double);

int main ()
{
	cout<<"\t FIND SQURE_ROOT OF NUMBERS \n\n\n\n";
	double num;
	cout<<"Enter number to find its squre root = ";
	cin>>num;
	
	cout<<"\nAnswer = "<<squre_root (num) << endl;

}

double squre_root ( double num)
{
	double result,temp=0;
	
	result=num/2;
	
	while(result!=temp)
	{
		temp=result;
		
		result= (num/result+result)/2;
	}
	return result;
}
