#include <iostream>
using namespace std;

int main ()
{
	cout << "\t Display N.th term and sum of harmonic series \n\n\n\n";
	int n_term;
	float  sum =1, i;
	
	cout << "Enter N.th / final term of harmonic series = ";
	cin >> n_term;
	cout << "1";
	
	for (i=2; i<=n_term; i++)
	{
		sum =sum + (1/i);
		cout << " + 1/"<<i;
	}
    cout << "\nSum of harmonic is = "<< sum;

	return 0;
}

