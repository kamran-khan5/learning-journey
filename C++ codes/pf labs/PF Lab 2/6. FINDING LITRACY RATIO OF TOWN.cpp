#include <iostream>
using namespace std;

int main ()
{
	cout << "\t FINDING LITRACY RATIO OF TOWN \n\n\n\n";
	
	int population=80000,pop_men, pop_women, illitracy, litracy, litrate_men, litrate_women, illitrate_men, illitrate_women;
	pop_men= population * 52 / 100;
	pop_women= population - pop_men;
    litrate_men= population * 35 / 100;
    litrate_women=  population * 13 / 100;
    litracy= population * 48 / 100;
	illitracy = population * 52 / 100;
    illitrate_men= illitracy * 52 / 100;
    illitrate_women = illitracy * 48 / 100;
    
    cout << "Population of town = "<< population << "\n\n Population of men (52%) = "<< pop_men << "\n\n Population of women (48%) = "<< pop_women;
    cout << "\n\n Litracy in town (48%) = "<< litracy<< "\n\n Illitracy in town (52%) = "<< illitracy
	<< "\n\n Litrate men = "<<litrate_men<< "\n\n Litrate women = "<<litrate_women;
    cout << "\n\n Illitrate men = "<< illitrate_men << "\n\n Illitrate women = "<< illitrate_women <<endl;
	return 0;
}

