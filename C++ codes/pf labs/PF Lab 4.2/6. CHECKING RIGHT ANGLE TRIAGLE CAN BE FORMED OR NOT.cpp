#include <iostream>

using namespace std;

int main ()
{
	cout<<"\t CHECKING RIGHT ANGLE TRIAGLE CAN BE FORMED OR NOT \n\n\n";
	
	int side1, side2, side3;
	
	cout<<"Enter first side of triangle = ";
	cin>>side1;
	
	cout<<"\nEnter second side of triangle = ";
	cin>>side2;
	
	cout<<"\nEnter third side of triangle = ";
	cin>>side3;
	
	(side1*side1 + side2*side2 == side3*side3 || side1*side1 + side3*side3 == side2*side2 || side3*side3 + side2*side2 == side1*side1)?
	 cout<<"\nThe Triangle is Right angled" : cout<<"\nThe Triangle is Scalene angled";
	

	return 0;
}

