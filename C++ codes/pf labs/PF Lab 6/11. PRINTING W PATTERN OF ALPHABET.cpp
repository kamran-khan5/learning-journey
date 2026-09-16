#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t PRINTING W PATTERN OF ALPHABETS \n\n\n\n";
	
	int i, j, row, letter;
	cout<< "Enter number of rows =";
	cin>> row;
	
	cout << endl << endl;
	
 
    for (i=0; i<=row; i++)
    {
    	for(j=65; j<64+(2*row); j++)
    	{
    		if (j>= (64+row)+i)
    		{
    			cout<<(char)((64+row)-(j%(64+row)))<<" ";
			}
			
			else if (j<=(64+row)-i)
			{
				cout<<(char)j<<" ";
			}
			
			else
			{
				cout<<"  ";
			}
		}
		cout<<endl;
	}
	return 0;
}

