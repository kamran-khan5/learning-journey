#include <iostream>
using namespace std;


int main ()
{
	cout<<"\t BINARY SEARCH IN 2D ARRAY \n\n\n";
	
	int row , col, i, j, k, temp;
	cout<<"Enter the number of row of array = ";
	cin>>row;
	
	cout<<"\nEnter the number of column of array = ";
	cin>>col;
    
    cout<<"\n\n";
    int array[row][col];
	for (i=0; i<row; i++)
    {
        cout<<"Row no = "<<i<<endl;
	    for ( j=0; j<col; j++)
	    {
		    cin >>array[i][j];
	    }
	}
	
	//sorting 
	for (i=0; i<row;i++)
	{
		for (j=0; j<col-j;j++)
		{
			for (k=0;k<col-j-1; k++)
			{
				if (array[i][k]>array[i][k+1])
			{
				temp=array[i][k];
				array[i][k]=array[i][k+1];
				array[i][k+1]=temp;
			}
			}
		}
	}
	
	cout<<"\n\nArray after sorting:\n";
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<col;j++)
		{
			cout<<array [i][j]<<"  ";
		}
		cout<<endl;
	}
	int num;
	cout<<"\n\nEnter number to find its index =";
	cin>>num;
	
	
	//binary search
	int in_row, in_col, check=0;
	for (i=0; i<row; i++)
	{
		int start=0, end=col-1;
	    while (end>start)
	    {
		    int mid=(start+end)/2;
		
		    if (array[i][mid]==num)
		    {
			    in_row=i;
				in_col=mid;
			    check=1;
			    break;
		    }
		    else if (array[i][mid]>num)
		    {
			    end=mid-1;
		    }
		    else 
		    {
			    start=mid+1;
		    }
	    }
	    if (check==1)
	    {
	    	break;
		}

	}
	
	cout<<"\nindex of number '"<<num<<"' :\nRow no = "<<in_row<<"\ncolumn no = "<<in_col<<endl;

	return 0;
}

