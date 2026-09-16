#include <iostream>
using namespace std;

int main ()
{
	cout << "\t Finding Joe earning from stocks \n\n\n\n";
	float stock_buy, stock_sale, buy_commession, sale_commession, earning;
	
	stock_buy = 40 * 2000;
	buy_commession = stock_buy * 3 / 100;
	stock_sale = 42.75 * 2000;
	sale_commession = stock_sale * 3 /100;
	earning = stock_sale - (stock_buy + buy_commession + sale_commession);
	
	cout << "The amount of money Joe paid for the stock = "<< stock_buy;
	cout << "\n\nThe amount of commission Joe paid his broker when he bought the stock = "<<buy_commession;
	cout << "\n\nThe amount that Joe sold the stock for = "<<stock_sale;
	cout << "\n\nThe amount of commission Joe paid his broker when he sold the stock = "<<sale_commession;
	cout << "\n\nThe amount Joe has left = "<< earning<< endl;


	return 0;
}

