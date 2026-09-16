#include <iostream>

using namespace std;

void array_reverse (int arr[], int size)
{
	for (int i=0; i<size/2 ; i++)
	{
		int temp=arr[i];
		arr[i] = arr[size- (i+1) ];
		arr[size- (i+1) ] = temp;
	}
	
	cout<<"\n\nReverse array:";
	for (int i=0; i<size ; i++)
	{
		cout<<endl<<arr[i];
	}
	cout<<endl;
	
}

int main()
{
	cout<< "\t ARRAY REVERSE \n\n\n\n";
	
	int size;
	cout<<"Enter array size = ";
	cin>> size;
	 
	int array[size];
	
	cout<<"\n\nEnter "<<size<<" number:\n";
	
	for (int i=0; i<size ; i++)
	{
		cout<<"\nEnter number =";
		cin>>array[i];
	}
	
	array_reverse (array , size);
}
