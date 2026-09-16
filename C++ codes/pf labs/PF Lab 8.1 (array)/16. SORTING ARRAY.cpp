#include <iostream>
using namespace std;

void array_sorting(int arr[], int size)
{
	for(int i=0; i<size ;i++)
	{
		for(int j=i+1; j<size; j++)
		{
			if(arr[i]>arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	cout<<"\n\nArray after sorting :\n";
	
	for(int i=0; i<size; i++)
	{
		cout<<arr[i]<<endl;
	}	
}

int main ()
{
	cout<< "\t SORTING ARRAY \n\n\n\n";
	
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
	
	array_sorting (array, size);

	return 0;
}

