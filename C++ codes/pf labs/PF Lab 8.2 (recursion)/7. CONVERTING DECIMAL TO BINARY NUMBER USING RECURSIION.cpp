#include <iostream>

using namespace std;

int decimal_to_binary (int num)
{
    if (num == 0)
    {
    	return 0;
    }
        
   	else
   	{
   		return (num % 2 + 10 * decimal_to_binary(num/2) );
	   }
       
}

main ()
{
	cout<< "\t CONVERTING DECIMAL TO BINARY NUMBER USING RECURSIION \n\n\n\n";
	
	int num;
	cout<<"Enter Decimal number to convert in Binary number = ";
	cin>>num;
	
	cout<<"\n\n Binary number : " << decimal_to_binary(num);

	return 0;
}

