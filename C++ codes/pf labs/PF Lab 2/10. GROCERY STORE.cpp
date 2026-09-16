#include <iostream>
using namespace std;

int main ()
{
	cout << "\t WELCOME TO GROCERY STORE \n\n\n";
	cout << "We have 5 basic grocery item \n\nPress '1' for FLORE\nPress '2' for RICE\nPress '3' for SUGER\nPress '4' for LENTILS\nPress '5' for COOKING OIL";
	int choice, price, tax;
	
	cout << "\nPlease! Enter number = ";
	cin>> choice;
	
	switch (choice)
	{
		case 1:
			price = 1500;
			tax = price*7 /100;
			cout << "\n\nPrice of FLORE is = " << price <<" + sales tax (7%)= "<< tax;
			cout << "\nNet price 20KG  RS= "<< price+tax;
			break;
			
		case 2:
			price = 1200;
			tax = price*7 /100;
			cout << "\n\nPrice of RICE is = " << price <<" + sales tax (7%)= "<< tax;
			cout << "\nNet price 5KG  RS= "<< price+tax;
			break;	
			
		case 3:
			price = 500;
			tax = price*7 /100;
			cout << "\n\nPrice of SUGAR is = " << price <<" + sales tax (7%)= "<< tax;
			cout << "\nNet price 5KG  RS= "<< price+tax;
			break;	
			
		case 4:
			price = 300;
			tax = price*7 /100;
			cout << "\n\nPrice of LENTILS is = " << price <<" + sales tax (7%)= "<< tax;
			cout << "\nNet price 1KG  RS= "<< price+tax;
			break;
				
		case 5:
			price = 3000;
			tax = price*7 /100;
			cout << "\n\nPrice of is COOKING OIL = " << price <<" + sales tax (7%)= "<< tax;
			cout << "\nNet price of 5KG  RS= "<< price+tax;
			break;
		
		default :
		    cout << "\n\nINVALID INPUT.  TRY AGAIN...";	
	  }  
    

	return 0;
}

