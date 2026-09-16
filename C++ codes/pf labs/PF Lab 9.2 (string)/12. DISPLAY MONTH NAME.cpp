#include <iostream>
#include <string>
using namespace std;

main ()
{
	cout<<"\t DISPLAY MONTH NAME \n\n\n";
	
	string month_name[]={"January", "Feburary", "March", "Aprail", "May", "June", "July", "Auguest", "September", "October","November", "December"};
	
	int choice;
	cout<<"Enter month number to show its name = " ;
	cin>>choice;
	
	cout<< "\n\nMonth name : "<<month_name [choice-1] << endl;


	return 0;
}

