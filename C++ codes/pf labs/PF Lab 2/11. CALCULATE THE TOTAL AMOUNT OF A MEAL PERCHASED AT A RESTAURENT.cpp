#include <iostream>
using namespace std;

int main ()
{
	cout << "\t CALCULATE THE TOTAL AMOUNT OF A MEAL PERCHASED AT A RESTAURENT \n\n\n\n";
	float food_charge, tip, sales_tax;
	
	cout << "Enter the charge for the food = ";
	cin >> food_charge;
	
	tip= food_charge*18/100;
	sales_tax= food_charge*7/100;
	cout << "\nCharge for the food = " <<food_charge<< "  + Tip (18%) ="<< tip<< "  + Sales tax (7%) = "<< sales_tax;
	cout << "\n\nNet price is = "<< food_charge+tip+sales_tax <<endl;


	return 0;
}

