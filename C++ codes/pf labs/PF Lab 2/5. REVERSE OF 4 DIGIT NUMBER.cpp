#include <iostream>
using namespace std;

int main ()
{
	cout << "\t REVERSE OF 4 DIGIT NUMBER \n\n\n\n";
	
	int digit_4, sum, thousand, hunderd, ten, unit;
	cout << "Enter four digit number =";
	cin >> digit_4;
	
	if (digit_4 < 10000 && digit_4 > 999)
	{
		unit = digit_4 % 10;
		thousand = digit_4 /1000;
		sum = unit + thousand;
		
		cout << "\nSum of first and last of number 4 digit '" << digit_4 << "' number = "<< sum << endl;
    }
    else 
    {
    	cout << "\nERROR... you enter greater or smaller than 4 digit number " << endl;
	}


	return 0;
}

