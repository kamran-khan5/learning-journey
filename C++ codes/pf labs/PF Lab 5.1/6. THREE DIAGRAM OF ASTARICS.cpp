#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t THREE DIAGRAM OF ASTARICS \n\n\n";
	
	// first diagram.
	
	int i,j;
	cout<<"\nFirst diagram.\n";
	for (i=1; i<=10 ; i++)
	{
		for (j=1; j<=i; j++)
		{
			cout<< "* ";
		}
		cout << endl;
	}
	
	
	// second diagram.
	int a, b, c;
	cout<<"\n\nSecond diagram.\n";
	for (a=1; a<=10; a++)
	{
		for (b=10-a; b>=1;b--)
		{
			cout<< "  ";
		}
		for (c=1; c<=a; c++)
		{
			cout << "* ";
		}
		cout<< endl;
	}
	
	
	// third diagram.
	int y,z,space;
	cout<<"\n\nThird diagram.\n";
    for(int y = 10; y >= 1; y--)
    {
        for(space = 0; space < 10-y; ++space)
            cout << "  ";

        for(z = y; z <= 2*y-1; z++)
            cout << "* ";

        for(z = 0; z < y-1; z++)
            cout << "* ";

        cout << endl;
    }


	return 0;
}

