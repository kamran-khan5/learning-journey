//sir logic


#include <iostream>
using namespace std;

int main ()
{
	cout<<"\tDisplay lcm.\n\n\n";
	
	int n1, n2, g, i, j, lcm=1;
	cout <<"Enter two number = ";
	cin>> n1>>n2;
	
	while (n1!=1 && n2!=1)
	{
		(n1>n2)?g=n1:g=n2;
		
		for (i=2; i<=g; i++)
		{
			if (n1%i==0 || n2%i==0)
			{
				lcm = lcm *i;
				if (n1%i==0)
				{
					n1=n1/i;
				}
				
				if (n2%i==0)
				{
					n2=n2/i;
				}
			}
		}
	}
	cout<< "LCM = "<<lcm;


	return 0;
}

