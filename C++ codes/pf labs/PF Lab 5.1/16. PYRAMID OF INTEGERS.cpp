#include <iostream>
using namespace std;

int main ()
{
	cout << "\t PYRAMID OF INTEGERS \n\n\n\n";
	
	int i, j, row, space, num=1;
	
	cout <<"Enter number of rows = ";
	cin>> row;
    
    cout<<endl<<endl;
    
	for (i=1; i<=row; i++)
    {
    	for (space=0; space<=row-i; space++)
    	{
    		cout<<"  ";
		}
		
		for (j=1; j<=i ; j++)
		{
			cout<<num++<<"   ";
		}
     cout<<endl;
    }


	return 0;
}

