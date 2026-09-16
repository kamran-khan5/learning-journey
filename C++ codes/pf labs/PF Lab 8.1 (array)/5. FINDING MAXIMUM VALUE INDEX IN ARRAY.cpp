#include <iostream>

using namespace std;

int max_value_index(int arr[], int size)
{
	int index=0, temp=arr[0];
	
	for (int i=1; i<size; i++)
	{
		if (arr[i]>temp)
		{
			index = i ;
			temp = arr[i];
		}
	}
	return index;
}

main ()
{
	cout<< "\t FINDING MAXIMUM VALUE INDEX IN ARRAY \n\n\n";
	
	int size;
	cout<<"Enter array size = ";
	cin>> size;
	 
	int array[size];
	
	cout<<"\n\nEnter "<<size<<" number:\n";
	
	for (int i=0;i<size;i++)
	{
		cout<<"\nEnter number =";
		cin>>array[i];
	}
	
	cout << "\n\nIndex of maximum value = "<< max_value_index( array, size ) << endl;


	return 0;
}

