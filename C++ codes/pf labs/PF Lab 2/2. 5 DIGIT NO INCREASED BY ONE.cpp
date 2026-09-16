#include <iostream>
using namespace std;

int main ()
{
	cout << "\t 5 DIGIT NO INCREASED BY ONE \n\n\n\n";
	
	int digit_5,result;
	cout << "Enter five digit number =";
	cin >> digit_5;
	if (digit_5 < 10000 || digit_5 > 99999)
	{
		cout << "\n\nERROR... you enter greater or smaller than 5 digit number " << endl;
	}
	else
	{
		result = digit_5 + 11111;
	    cout << "\nValue after increasing =" << result << endl;
    }

	return 0;
}

