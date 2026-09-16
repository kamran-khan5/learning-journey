#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t FINDING SECOND LARGEST IN ARRAY \n\n\n";
	
	float num[5],second_lar,large=-87765648;
	
	for (int i=0;i<=4;i++)
	{
		cout<<"\nEnter number =";
		cin>>num[i];
		if (num[i]> large)
		{
			second_lar=large;
			large=num[i];
		}
		
		else if (num[i]> second_lar)
		{
			second_lar=num[i];
		}
		
	}
	cout << "\n\nLargest =" << large << "\n\nSecond largest =" << second_lar << endl;

	return 0;
}
