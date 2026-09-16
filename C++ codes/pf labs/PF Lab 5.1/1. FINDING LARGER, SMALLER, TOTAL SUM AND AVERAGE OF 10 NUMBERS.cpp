#include <iostream>
using namespace std;

int main ()
{
	cout << "\t FINDING LARGER, SMALLER, TOTAL SUM AND AVERAGE OF 10 NUMBERS \n\n\n";
	
	int i,num, larger, smaller;
	float avg, sum=0;
	
	cout<< "Enter 10 numbers."<<endl;
	cout<<"\nEnter 1 number = ";
	cin >> num;
	sum+=num;
	larger = num;
	smaller = num;
	
	for ( i=2; i<=10; i++)
	{
		sum+=num;
		
		cout<<"Enter "<<i<<" number = ";
		cin >> num;
		
		if (num < smaller)
		{
			smaller = num;
		}
		
		if (num > larger )
		{
			larger = num;
		}
	}
    
    avg = sum / 10;
    cout << "\nSmaller = "<<smaller<<"\n\nLarger = "<< larger<< "\n\nTotal sum = "<< sum<< "\n\nAverage = "<< avg<< endl;

	return 0;
}

