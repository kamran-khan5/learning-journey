#include <iostream>
using namespace std;

int main ()
{
	cout << "\t REVERSE OF 5 DIGIT NUMBER \n\n\n\n";
	
	int digit_5, ten_thousand, thousand, hunderd, ten, unit;
	cout << "Enter five digit number =";
	cin >> digit_5;
	
	if (digit_5 < 100000 && digit_5 > 9999)
	{
		unit = digit_5 % 10;
		ten = digit_5 % 100/10;
		hunderd = digit_5 % 1000/100;
		thousand = digit_5 % 10000/1000;
		ten_thousand =digit_5 / 10000;
		
		cout << "\nReverse of 5 digit '" << digit_5 << "' number = "<<unit<<ten<<hunderd<<thousand<<ten_thousand<< endl;
    }
    else 
    {
    	cout << "\n\nERROR... you enter greater or smaller than 5 digit number " << endl;
	}


	return 0;
}

