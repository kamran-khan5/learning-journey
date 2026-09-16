#include <iostream>

using namespace std;

int check_palindrome(int arr[], int size)
{
	int temp=size-1;
	
	for (int i=0; i<size/2; i++, temp--)
	{
		if(arr[i] != arr[temp])
		{
			return 0;
		}
	}
	return 1;
}
main ()
{
	cout<< "\t FINDING ARRAY IS PALINDROME OR NOT \n\n\n";
	
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

    if (check_palindrome( array, size))
	{
		cout<<"\n\nArray is Palindrome." << endl ;
	}
	else
	{
		cout<<"\n\nArray is not Palindrome." << endl ;
	}
	return 0;
}

