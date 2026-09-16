#include <iostream>
using namespace std;

int main ()
{
	cout << "\t Finding percentage of male and female in class \n\n\n";
	float male, female, male_percentage, female_percentage;
	
	cout << "Enter the no of male student = ";
	cin >> male;

    cout << "\nEnter the no of female student = ";
	cin >> female;
	
	male_percentage = male *100 / (male+female);
    female_percentage = female *100 / (male+female);
    cout << "\n\nPercentage of male = "<< male_percentage<< "%\nPercentage of female = "<< female_percentage<<"%"<< endl;
    

	return 0;
}

