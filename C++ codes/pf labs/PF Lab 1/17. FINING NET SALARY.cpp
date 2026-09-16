#include <iostream>
using namespace std;

int main ()
{
	cout << "\t FINING NET SALARY\n\n\n\n";
	int basic_salary, house_rent, medical_allowance, convince_allowance,net_salary;
	cout << "\nEnter your salary = ";
	cin >> basic_salary;
	
	house_rent= basic_salary * 15 /100;
    medical_allowance= basic_salary * 10 / 100;
    convince_allowance= basic_salary * 5 / 100;
    cout << "\nYour basic salary "<<basic_salary << "\n15% House rent="<< house_rent
	<< "\n10% Medical allowance="<<medical_allowance << "\n5% Convince allowance="<<convince_allowance;
    net_salary=basic_salary + house_rent + medical_allowance + convince_allowance;
    cout << "\n\nYour net salary = "<< net_salary << endl;
	return 0;
}

