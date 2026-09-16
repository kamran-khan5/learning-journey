#include <iostream>
using namespace std;

int main()
{
	cout<<"\t PRINTIG 0*0* PATTERN \n\n\n\n";
	
	int i, j, row;
	cout<< "Enter number of rows =";
	cin>> row;
	
	cout << endl << endl;
	
	for (i=1; i<=row; i++)
	{
		for(j=1; j<=10; j++)
		{
			if(i%2!=0)
			{
				cout <<"*";
			}
			else
			{
			    if(j%2!=1)
			    {
				    cout <<"*";
			    }
			    else
			    {
				    cout <<"0";
			    }
		    }
		}
		cout <<endl;
	}


	return 0;
}

