#include<iostream>

using namespace std;

int main()
{
	cout<<"\t FIND FACTORIAL \n\n\n";
	int n ,fact=1;
	
	cout<<"Enter a number to find itas factorial = ";
    cin>>n;
    for(int i=1;i<=n;++i)
    {
    	fact *=i;
    	
	}
	
	cout<<"\nFactorial of number  '"<<n<<"'  is = "<<fact<<endl;
}
