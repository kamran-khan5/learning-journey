#include <iostream>
using namespace std;

int main()
{
	cout<<"\t PRINTING PYRAMID OF ALPHABETS \n\n\n\n";
	
	int i, j, row;
	
	cout<< "Enter number of rows of alphabets pyramid=";
	cin>> row;
	
	cout << endl << endl;
	
	for (i=1; i<=row; i++)
	{
		int value=64;
		for (j=1 ;j<=row-i; j++)
		{
			cout<<"  ";
		}
		
		for (j=1; j<=i; j++)
		{
		    value++;
			cout<<(char)value << " ";
	    }
	    for (j=2; j<=i; j++)
	    {
	    	value--;
	    	cout<<(char)value << " ";
		}
	    cout<<endl;
	}


	return 0;
}

