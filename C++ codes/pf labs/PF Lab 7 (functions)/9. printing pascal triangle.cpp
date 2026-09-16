#include <iostream>
using namespace std;

void print_space(int);
long find_factorial (int,int);
long pascal_formula (int,int);

int main ()
{
	cout<<"\t PRINT PASCAL`s TRIANGLE \n\n\n\n";
	
	int row,n,k;
	cout<<"Enter number number of rows = ";
	cin >>row;
	
	cout<< endl << endl;
	
	for (n=0; n<row; n++)
	{
	    print_space(row*2-n*2-1);
	    
	    for(k=0; k<=n; k++)
	    {
		    long t=pascal_formula(n,k);
		    (t>9)?cout<<t<<"  ":cout<<t<<"   ";
	    }
	    cout<<endl;
	}
	
    

	return 0;
}

void print_space(int space)
{
	for (int i=0;i<space; i++)
	{
		cout<<" ";
	}
}

long find_factorial (long num)
{
	long fact=1 ;
	for (int i=num; i>=1; i--)
	{
		fact*=i;
	}
	return fact;
}

long pascal_formula (int n, int k)
{
	long num=find_factorial(n) / (find_factorial(k) * find_factorial (n - k));
	return num;
}
