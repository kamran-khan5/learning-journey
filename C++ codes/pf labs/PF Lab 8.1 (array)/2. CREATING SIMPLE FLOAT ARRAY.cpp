#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t CREATING SIMPLE FLOAT ARRAY \n\n\n\n";
	
	float num[5];
	
    cout<<"Enter five number:\n";
	
	for (int i=0;i<=4;i++)
	{
		cout<<"\nEnter number =";
		cin>>num[i];
	}
	
	cout<<"\n\nYou Enter five numbers:";
	
	for (int i=0;i<=4;i++)
	{
		cout<<endl <<num[i];
	}
	cout<<endl;

	return 0;
}
