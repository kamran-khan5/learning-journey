#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t TRIANGLE OF 0 AND 1 \n\n\n";
	
	int i, j, row;
	
	cout << "Enter number of rows = ";
    cin >> row;
    
    cout<<endl<<endl;
	for (i=1; i<=row ; i++)
	{
		for (j=1; j<=i; j++)
		{
			if (i%2 == 0)
            {
                if (j%2==0)
                    printf("1");
                else
                    printf("0");
            }
        else
        {
            if (j%2==0)
                printf("0");
            else
                printf("1");
        }
		}
		cout << endl;
	}
	


	return 0;
}

