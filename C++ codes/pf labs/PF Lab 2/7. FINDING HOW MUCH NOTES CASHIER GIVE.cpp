#include <iostream>
using namespace std;

int main ()
{
	cout << "\t FINDING HOW MUCH NOTES CASHIER GIVE \n\n\n\n";
	
	int cash_withdraw, notes_100, notes_50, notes_10, remender_100, remender_50;
	
	cout << "Enter the cash you want to withdraw =";
	cin >> cash_withdraw;
	
	if (cash_withdraw % 10 ==0)
	{
		notes_100 = cash_withdraw/100;
		remender_100 = cash_withdraw % 100;
		notes_50 = remender_100 /50;
		remender_50 = remender_100 % 50;
		notes_10 = remender_50 / 10;
		cout << "\nCahier give \nNotes of 100 = "<<notes_100 <<"\nNotes of 50 = "<<notes_50<< "\nNotes of 10 = "<<notes_10 << endl;
	}
    else 
    {
    	cout << "\n\nSorry you need to enter amount contain zero at last.  Try Again."<< endl ;
    	
	}

	return 0;
}

