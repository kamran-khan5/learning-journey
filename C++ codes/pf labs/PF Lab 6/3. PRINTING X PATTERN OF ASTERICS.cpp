#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t PRINTING X PATTERN OF ASTERICS \n\n\n\n";
	
	int i, j, row, n;
	cout<< "Enter number of rows (half of x pattern) =";
	cin>> row;
	
	n=row*2-1;
	
	cout << endl << endl;
	
	for (i=1; i<=n; i++)
	{
		for (j=1 ;j<=n; j++)
		{
			if (j==i || (j==n - i + 1))
			{
				cout<< "*";
			}
			else
			{
				cout<< " ";
			}
	    }
	    cout<< endl;
	}


	return 0;
}

