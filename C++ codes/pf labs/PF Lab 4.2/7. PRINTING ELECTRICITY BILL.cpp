#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t PRINTING ELECTRICITY BILL \n\n\n";
	
	float id_num, unit, bill;
	string name;
	
	cout<< "Enter customer id = ";
	cin>> id_num;
	
	cout << "\nEnter your good name = ";
	cin>> name;
	
	cout << "\nEnter unit you consumed = ";
	cin>> unit;
	
//	(unit>=600)? bill=unit*2.0 : (unit>=400)? bill=unit*1.80 : (unit>=200)? bill=unit*1.50 :
//	 (unit<=199)? bill=unit*1.20 : (unit<0)? cout<< "\n\nERROR... you enter invalid unit number ": cout<<endl;
		
	if (unit>=600)
	{
		bill=unit*2.0;
	}
	else if (unit>=400)
	{
		bill=unit*1.80;
	}
	else if (unit>=200)
	{
		bill=unit*1.50;
	}
	else if (unit<=199)
	{
		bill=unit*1.20;
	}
	else if (unit<0)
	{
		cout<< "\n\nERROR... you enter invalid unit number ";
	}
	cout<< "\n\nYour electricity bill is = "<< bill<<" $ "<< endl;
	
	return 0;
}

