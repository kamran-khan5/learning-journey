#include <iostream>
using namespace std;

int main()
{
	cout<<"\t PRINTING HOLLOW DIAMOND OF ASTERIC \n\n\n\n";
	
	int i, j, row,n;
	cout<< "Enter number of rows (half diamond)=";
	cin>> row;
	
	cout << endl << endl;
	
	for (i=1; i<=row; i++)
	{
		for (j=1 ;j<=row-i; j++)
		{
			cout<<"  ";
		}
		for (j=1; j<=2*i-1; j++)
		{
			if (j==1 || j==(2*i-1))
			{
				cout<< "* ";
			}
			else
			{
				cout<< "  ";
			}
		}
		cout<< endl;
	}
	
	for (i=row-1; i>=1; i--)
	{
		for (j=1 ;j<=row-i; j++)
		{
			cout<<"  ";
		}
		for (j=1; j<=2*i-1; j++)
		{
			if (j==1 || j==(2*i-1))
			{
				cout<< "* ";
			}
			else
			{
				cout<< "  ";
			}
		}
		cout<< endl;
	}
	


	return 0;
}

