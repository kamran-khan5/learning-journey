#include <iostream>
using namespace std;

int main ()
{
	cout<<"  (x-1/x) + 1/2(x-1/x)^2 + 1/2(x-1/x)^3 + ... + 1/2(x-1/x)^6\n\n\n";
	int i,j;
	float x,a;
	cout << "Enter the value of 'x' = ";
	cin >> x ;
	a=x-1/x;
	float sum=a;
	for (i=1; i<=6; i++)
	{
		double tempsum=1;
		a=0;
		for (j=7-i;j>=1; j--)
		{
			a=x-1/x;
			tempsum*=a;
		}
		sum=sum+ (1/2*(tempsum));
		
		//sum+=tempsum;
	}
	cout<< "Total sum ="<<sum;
	


	return 0;
}

