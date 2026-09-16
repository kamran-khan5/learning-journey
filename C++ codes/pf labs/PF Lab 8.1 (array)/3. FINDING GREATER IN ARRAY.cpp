#include <iostream>
using namespace std;


int main ()
{
	cout<< "\t FINDING GREATER IN ARRAY \n\n\n";
	
	float num[5],greater=-87765648;
	
	for (int i=0;i<=4;i++)
	{
		cout<<"\nEnter number =";
		cin>>num[i];
		if (num[i]> greater)
		{
			greater=num[i];
		}
		
	}
	cout<<"\n\nGreater = " << greater << endl;

	return 0;
}

