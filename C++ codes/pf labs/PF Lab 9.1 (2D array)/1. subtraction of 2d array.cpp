#include <iostream>
using namespace std;

int main()
{
	cout<< "\tSUBTRACTION OF MATRIX\n\n";
	int i, j, row1, col1, row2, col2;
	cout<<"Enter the number of row of first array = ";
	cin>>row1;
	
	cout<<"Enter the number of column of first array = ";
	cin>>col1;
	
	cout<<"Enter the number of row of second array = ";
	cin>>row2;
	
	cout<<"Enter the number of column of second array = ";
	cin>>col2;
	
	int arr1[row1][col1], arr2[row2][col2], arr3[row1][col1];
	
	if (row1!=row2 || col1!=col2)
	{
		cout<<"You cannot subtract unless ordor of both matrix same";
	}
	else
	{
		cout<<"\n\n\nEnter the first array : \n";
	    for ( i=0;i<row1; i++)
        {
            cout<<"Row no = "<<i<<endl;
		    for (j=0; j<col1; j++)
		    {
			    cin >>arr1[i][j];
		    }
	    }
	
	    cout<<"\n\n\nEnter the second array : \n";
	    for ( i=0;i<row2; i++)
	    {
	    	cout<<"Row no = "<<i<<endl;
		    for (j=0; j<col2; j++)
		    {
			    cin >>arr2[i][j];
		    }
	    }
	    
	    //subtraction
		for (i=0;i<row1; i++)
	    {
		    for (j=0; j<col1; j++)
		    {
			    arr3[i][j]=arr1[i][j]-arr2[i][j];
		    }
	    }
	    
	    cout<<"\n\n\nAfter subtraction:\n";
	    for (i=0;i<row1; i++)
	    {
		    for (j=0; j<col1; j++)
		    {
			    cout <<arr3[i][j]<<"  ";
		    }
		    cout<<endl;
	    }
	}

	return 0;
}
