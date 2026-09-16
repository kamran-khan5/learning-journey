#include <iostream>

using namespace std;

main ()
{
	cout<<"\t FINDING ARMSTRONG NUMBER \n\n\n";

    int num;
    cout<<"Enter number to find it is Armstrong or not = ";
    cin>>num;
    
    int number= num;
    int sum=0;
    
    while(num!=0)
    {
    	int temp = num % 10;
    	sum  = sum + temp * temp * temp;
    	num = num / 10;
	}
	
	if ( number == sum)
	{
		cout<<endl<<number<<" Is Armstrong."<<endl; 
	}
	else
	{
		cout<<endl<<number<<" Is Not Armstrong."<<endl; 
	}
    
    
    
	return 0;
}

