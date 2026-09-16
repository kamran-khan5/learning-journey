#include <iostream>
using namespace std;

int main ()
{
	cout <<"\tSum of the Nth no this series 1/1! + 1/2! + 1/3! +...+ 1/n!  \n\n\n\n";
	
	int n_term,i,j;
	double sum=0;
	cout<< "Enter the Nth term of series = ";
	cin>> n_term;
	
		
	for (i=1; i<=n_term; i++)
	{
		double fact=1;
		for (j=(n_term+1)-i; j>=1; j--)
		{
			fact*=j;
		}
	sum=sum+ (1/fact);
	}
    cout << "\nSum of harmonic series is = "<< sum<<endl;
	


	return 0;
}

