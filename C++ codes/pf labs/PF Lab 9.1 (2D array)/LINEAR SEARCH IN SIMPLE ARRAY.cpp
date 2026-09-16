#include <iostream>
using namespace std;

int search (int arr[],int n, int key)
{
	for (int i=0;i<n;i++)
	{
		if (arr[i]==key)
		{
			return i;
		}
	}
	return -1;
}


int main ()
{
	cout<< "\t LINEAR SEARCH IN SIMPLE ARRAY \n\n\n";
	
	int n,i,key;
	cout<<"enter array size=";
	cin>>n;
	
	cout<<"Enter array:\n";
	int arr[n];
	for (i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	
    cout<<"Enter key =";
    cin>>key;
    
    cout<<"index no ="<<search(arr,n,key)<<endl;

	return 0;
}

