#include <iostream>
using namespace std;

int main ()
{
	cout << "\t THE PYTHAGOREAN TRIPLETS 3 SIDES \n\n\n";
	
	for(int i=1 ;i*i<=500; i++)
	{
		for(int j=1; j*j<=500; j++)
		{
			for(int k=1; k*k<=500; k++)
			{
				if((i*i)==(j*j)+(k*k) && i!=0 && j!=0 && k!=0)
					cout << "	" << i << "	" << j << "	" << k << "\n";
			}
		}
	}


	return 0;
}

