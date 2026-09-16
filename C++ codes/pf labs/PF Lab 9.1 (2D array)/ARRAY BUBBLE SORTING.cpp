#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t ARRAY BUBBLE SORTING \n\n\n\n";
	
	int size;
	cout << " Enter size of array : ";
	cin >> size;
	
	int arr[size];
	
	cout << "\n Enter " << size <<" Numbers : " << endl;
	for (int i=0; i<size ;i++)
	{
		cin >> arr[i];
	}
	
	for (int i=0; i<size-i; i++)
	{
		for (int j=0;j<size-i-1;j++)
		{
			if (arr[j]>arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
				
	}
	
	//array disaplay
	cout << "\n\n After sorting : " << endl ;
	for (int i=0;i<size;i++)
	{
		cout<<arr[i]<<endl;
	}


	return 0;
}

