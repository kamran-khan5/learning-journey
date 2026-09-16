#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t SUM OF EVEN INDEX NUMBER IN ARRAY \n\n\n";
	
	int size, sum=0;
	cout<<"Enter array size = ";
	cin>> size;
	 
	int array[size];
	
	cout<<"\n\nEnter "<<size<<" number:\n";
	
	for (int i=0; i<size; i++)
	{
		cout<<"\nEnter number =";
		cin>>array[i];
		
		if (i%2==0)
		sum+= array[i];
	}
	
	cout<<"\n\nTotal sum of odd numbers in array =" << sum << endl;

	return 0;
}
