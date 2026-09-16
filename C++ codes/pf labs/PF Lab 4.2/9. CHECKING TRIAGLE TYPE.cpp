#include <iostream>

using namespace std;

int main ()
{
	cout<<"\t CHECKING TRIAGLE TYPE \n\n\n";
	
	int side1, side2, side3;
	
	cout<<"Enter first side of triangle = ";
	cin>>side1;
	
	cout<<"\nEnter second side of triangle = ";
	cin>>side2;
	
	cout<<"\nEnter third side of triangle = ";
	cin>>side3;
	
    if (side1==side2 && side2==side3 && side1==side3 )
    {
    	cout<<"\nThe Triangle is Equilateral.";
	}
	else if ((side1==side2 && side2!=side3) || (side1==side3 && side1!=side2) || (side2==side3 && side1!=side2))
	{
		cout<<"\nThe Triangle is Isosceles .";
	}
	else
	{
		cout<<"\nThe Triangle is Scalene .";
	}

	return 0;
}

