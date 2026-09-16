#include <iostream>

using namespace std;

int main ()
{
	  cout << "\t PRIME NUMBERS BETWEEN 1 AND 300 \n\n\n";

    for(int i=2; i<=300; i++) 
    {   
	    int check=0; 

        for(int j=2;  j<=i/2; j++) 

        {   if(i%j==0)

                check=1; 

        }

            if(check==0) 

                cout<<i<<" is Prime Number.\n\n";

    }


	return 0;
}

