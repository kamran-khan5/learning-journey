#include <iostream>
using namespace std;

int main ()
{
	cout <<"\tSum of the Nth no this series 1/1! + 1/2! + 1/3! +...+ 1/6!\n\n";
	
	int i,j;
	float sum=0;
	
		
	for (i=1; i<=6; i++)
	{
		float fact=1;
		for (j=7-i;j>=1; j--)
		{
			fact*=j;
		}

		sum=sum+ (1/fact);
	}
    cout << "\n\nSum of harmonic series is = "<< sum<<endl;
	


	return 0;
}

