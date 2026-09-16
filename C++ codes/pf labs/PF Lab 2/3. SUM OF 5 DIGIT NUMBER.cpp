#include <iostream>
using namespace std;

int main ()
{
	cout << "\t SUM OF 5 DIGIT NUMBER \n\n\n\n";
	
	int digit_5, sum,ten_thousand, thousand, hunderd, ten, unit;
	cout << "Enter five digit number =";
	cin >> digit_5;
	
	if (digit_5 < 100000 && digit_5 > 9999)
	{
		unit = digit_5 % 10;
		ten = digit_5 % 100/10;
		hunderd = digit_5 % 1000/100;
		thousand = digit_5 % 10000/1000;
		ten_thousand =digit_5 / 10000;
		sum = unit + ten + hunderd + thousand + ten_thousand;
		cout << "\nSum of 5 digit '" << digit_5 << "' number = "<< sum << endl;
    }
    else 
    {
    	cout << "\nERROR... you enter greater or smaller than 5 digit number " << endl;
	}
	return 0;
}

