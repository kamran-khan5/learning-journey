#include <iostream>
using namespace std;

int find_factorial(int num)
{
	int fact=1;
	for (int i=num; i>1; i--)
	{
		fact=fact*i;
	}
	return fact;
}

main ()
{
	cout<<"\t DISPLAY PASCLE'S TRIANGLE \n\n\n";
	
	int row,col, i, space, j, num ;
	
	cout << "Enter number of rows = ";
    cin >> row;
    
    for (i=0; i<=row; i++)
    {
        for (space=0; space<=row-i; space++)
    	{
    		cout<<"  ";
		}
		col=i;
		for (j=0; j<=col; j++)
		{
			num= find_factorial(i) / (find_factorial(j) * find_factorial(i - j));
			cout<<num<<"   ";
		}
		cout<<endl;
	}
	


	return 0;
}

