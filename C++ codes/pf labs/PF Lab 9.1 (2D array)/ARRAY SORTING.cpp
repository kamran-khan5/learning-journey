#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t ARRAY SORTING \n\n\n\n";
	
	int size;
	cout << " Enter size of array : ";
	cin >> size;
	
	int arr[size];
	
	cout << "\n Enter " << size <<" Numbers : " << endl;
	for (int i=0; i<size ;i++)
	{
		cin >> arr[i];
	}
	
	for (int i=0; i<size-1; i++)
	{
		for (int j=i+1; j<size;j++)
		{
			if (arr[j]<arr[i])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
				
	}
	//array disaplay
	cout << "\n\n After sorting : " << endl ;
	for (int i=0; i<size; i++)
	{
		cout << arr[i] << endl ;
	}
	
	return 0;
}
