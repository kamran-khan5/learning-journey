#include <iostream>
using namespace std;

int main ()
{
	cout << "\t TEMPHERETURE CHANGING FROM FAHRENHEIT TO CENTEIRADE \n\n\n\n";
	float fahrenheit, centigrade;
	cout << "Enter temphereture in fahrenheit =";
	cin >> fahrenheit ;
	
	centigrade = (fahrenheit - 32) * 5/9;
	cout << "\n\nTemphereture in Centigrade = " << centigrade << endl; 
	
	return 0;
}

