#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t SHOW THE ROW AND COLUMN INDEX OF 2D ARRAY\n\n\n";
	
	int row , col, i, j;
	cout<<"Enter the number of row of array = ";
	cin>>row;
	
	cout<<"Enter the number of column of array = ";
	cin>>col;
	
	int array[row][col];
	for (i=0; i<row; i++)
    {
        cout<<"Row no = "<<i+1<<endl;
	    for ( j=0; j<col; j++)
	    {
		    cin >>array[i][j];
	    }
	}
    
	
	int num ;
	cout<<"\n\nEnter number to find its index =";
	cin>>num;
	
	int temp=0;
	for ( i=0; i<row; i++)
	{
		for ( j=0; j<col; j++)
		{
			if ( num==array[i][j] )
			{
				temp++;
				cout<<"\nIndex of number '"<<num<<"' :\nRow no = "<<i<<"\ncolumn no = "<<j<<endl;
			}
		}
		
	}
	
	if (temp==0)
		{
			cout<<"Try Again... \nEnter number is not present in the array.";
		}

	return 0;
}

