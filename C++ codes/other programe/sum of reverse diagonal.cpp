#include <iostream>
using namespace std;

int main ()
{
	cout<< "\tSUM OF INVERSE_DIAGONAL OF MATRIX\n\n\n\n";
	
	int num;
	cout<<"Enter the number of row and coloumn (Matrix ordor) = ";
	cin>>num;
	
    int array[num][num];
    for (int i=0;i<num; i++)
        {
            cout<<"\nRow no = "<<i+1<<endl;
		    for (int j=0; j<num; j++)
		    {
			    cin >>array[i][j];
		    }
	    }
    
    int sum=0, temp=num-1;
    for (int i=0; i<num; i++)
    {
    	sum+=array[i][temp];
    	temp--;
	}
	cout<<"\n\n\nSum of inverse_diagonal of matrix = "<<sum<<endl;

	return 0;
}

