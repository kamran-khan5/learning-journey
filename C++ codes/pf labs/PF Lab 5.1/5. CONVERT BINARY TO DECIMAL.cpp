#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t CONVERT BINARY TO DECIMAL \n\n\n";
	
	long long binnum, decnum=0, i, rem;
    cout<<"Enter any Binary Number: ";
    cin>>binnum;
    for (i=1; binnum!=0;  binnum = binnum/10)
    {
        rem = binnum%10;
        decnum = decnum + (rem*i);
        i = i*2;
       
    }
    cout<<"\nEquivalent Decimal Value = "<<decnum;
    cout<<endl;


	return 0;
}

