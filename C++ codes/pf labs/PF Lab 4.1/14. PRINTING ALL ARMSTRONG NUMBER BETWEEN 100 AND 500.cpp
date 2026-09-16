#include <iostream>

using namespace std;

main ()
{
	cout<<"\t PRINTING ALL ARMSTRONG NUMBER BETWEEN 100 AND 500\n\n\n";
    
	int number;
    int sum;   
    
    for (int num=100; num<=500; num++)
    {
    	int check = num;
    	int number = num;
        int sum = 0;
    
        while(check != 0)
        {
    	    int temp = check % 10;
    	    sum  = sum + temp * temp * temp;
    	    check = check / 10;
	    }
	
	    if ( number == sum)
	    {
		    cout<<endl<<number<<" Is Armstrong."<<endl; 
	    }
	
    }
 
	return 0;
}

