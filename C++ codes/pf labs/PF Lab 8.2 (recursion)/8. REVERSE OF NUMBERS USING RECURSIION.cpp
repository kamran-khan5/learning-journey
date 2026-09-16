#include <iostream>

using namespace std;

int num_reverse ( int num )
{
	static int sum,temp;
	
	if (num>0)
	{
		temp = num%10;
	    sum =  sum * 10 + temp;
		
		num_reverse(num/10); 
	}
	return sum;
}

main ()
{
	cout<< "\t REVERSE OF NUMBERS USING RECURSIION \n\n\n\n";
	
	int num;
	cout<<"Enter number to find its reverse = ";
	cin>>num;
	cout<<endl<<endl<<"Reverse of numbers : "<<num_reverse(num) << endl;

	return 0;
}
