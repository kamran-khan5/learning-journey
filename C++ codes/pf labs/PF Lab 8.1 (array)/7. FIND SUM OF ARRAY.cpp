#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t FIND SUM OF ARRAY \n\n\n";
	
	int size, sum=0;
	cout<<"Enter array size = ";
	cin>> size;
	 
	int array[size];
	
	cout<<"\n\nEnter "<<size<<" number:\n";
	
	for (int i=0; i<size; i++)
	{
		cout<<"\nEnter number =";
		cin>>array[i];
		sum+= array[i];
	}
	
	cout<<"\n\nTotal sum =" << sum << endl;

	return 0;
}
