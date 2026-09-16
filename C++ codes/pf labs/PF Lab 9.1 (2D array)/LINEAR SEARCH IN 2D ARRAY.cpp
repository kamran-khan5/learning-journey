#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t LINEAR SEARCH IN 2D ARRAY \n\n\n";
	
	int i, j, num, row, col;
	cout<<"Enter the  row number of array = ";
	cin>>row;
	
	cout<<"Enter the coloumn number of array = ";
	cin>>col;
    
    int arr[i][j];
    cout<<"\n\n\nEnter the array : \n";	
	for ( i=0;i<row; i++)
    {
        cout<<"Row no = "<<i<<endl;
	    for (j=0; j<col; j++)
		    {
			    cin >>arr[i][j];
		    }
    }
	
	cout <<"\n\nEnter number to find its index = ";
	cin>>num;
	
	int temp=0;
	for ( i=0;i<row; i++)
    {
	    for (j=0; j<col; j++)
		    {
			    if (num==arr[i][j])
			    {
			    	cout<<"\nindex number:\nRow number = "<<i<<"\nColoumn number = "<<j<<endl;
			    	temp=1;
			    	break;
				}
		    }
		if(temp==1)
		{
		    break; 
		}   
    }   
	    
	return 0;
}

