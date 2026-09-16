#include <iostream>
using namespace std;

int main ()
{
	cout << "\t Finding how much ingredient needed for the specified number of cookies \n\n\n";
	float cookies, sugar_cup, butter_cup, flour_cup;
	
	cout << "Enter number of cookies do you want to cook = ";
	cin >> cookies;
	
	sugar_cup = cookies * 0.03125;
	butter_cup = cookies * 0.020833333;
	flour_cup = cookies * 0.0572916667;
	cout << "\n\nFor the '"<<cookies<< "' no of cookies you need (100ml cup)\n\n"<<sugar_cup<<"  cups  of  sugar\n\n";
	cout <<butter_cup<< "  cups  of  butter\n\n"<< flour_cup<<"  cups  of  flour";

	return 0;
}

