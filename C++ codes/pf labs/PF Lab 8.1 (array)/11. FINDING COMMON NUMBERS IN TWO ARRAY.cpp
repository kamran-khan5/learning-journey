#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t FINDING COMMON NUMBERS IN TWO ARRAY \n\n\n";
	
	int arr1[5],arr2[5];
	cout<<"Enter first array number\n";
	for (int i=0; i<5 ;i++)
	{
		cin>>arr1[i];
	}
	
	cout<<"\n\nEnter second array number\n";
	for (int i=0;i<5;i++)
	{
		cin>>arr2[i];
	}
	
	int temp;
	
	cout<<"\n\nCOMMON NUMBERS\n";
	for (int i=0 ; i<5; i++)
	{
		for (int j=0; j<5; j++)
		{
			if (arr2[i]==arr1[j] && temp!=arr2[i])
			{
				temp=arr2[i];
				cout<<arr2[i]<<" is same number\n";
			}
        }
    }

	return 0;
}
