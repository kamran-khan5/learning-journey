#include <iostream>
using namespace std;

int main ()
{
	cout << "\t FIND THE COST PRICE OF ONE ITEM \n\n\n\n";
	float price_15_item, profit, cost_1_item;
    cout << "Enter price of 15 item = ";
    cin >>  price_15_item;
    
    cout << "\nEnter profit you earned on that 15 item = ";
    cin >> profit ;
    
    cost_1_item = (price_15_item - profit)/15;
    cout << "\nCost price of one item = " << cost_1_item<< endl;
    
	return 0;
}

