#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t PRINTING  1  10  100  1000   PATTERN \n\n\n\n";
	
	int i, j, row, result;
	
	cout<< "Enter number of rows =";
	cin>> row;
	
	cout << endl << endl;
	
	for (i=1; i<=row; i++)
	{
		result=i;
		for (j=1; j<=4; j++)
		{
			cout << result<< "\t";
			result*=10;
		}
		cout<<endl;
	}


	return 0;
}

