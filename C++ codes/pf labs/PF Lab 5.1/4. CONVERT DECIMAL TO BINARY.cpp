#include <iostream>
using namespace std;

int main ()
{
	cout<<"\t CONVERT DECIMAL TO BINARY \n\n\n";
	int num, rem;
	long long bin=0;
	cout<<"Enter a decimal number = ";
	cin>>num;
	
	for(int i=1; num!=0; num/=2)
	{
		rem=num%2;
		bin=bin+rem*i;
		i=i*10;
		
	}
	
	cout<<"Binary equivalent = "<<bin<<endl;


	return 0;
}

