#include <iostream>
using namespace std;

int main ()
{
	cout << "\t PYRAMID OF INTEGER \n\n\n";
	
	int i, j, row;
	
	cout << "Enter number of rows = ";
    cin >> row;
    
	for(i=0; i<=row; i++)
    {
        for(j=1; j<=row-i; j++)
            cout<<"  ";
            
        for(j=1;j<=2*i-1;j++)
            cout<<j<<" ";
            
     cout<<endl;
   }




	return 0;
}

