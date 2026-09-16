#include <iostream>

using namespace std;

//globle variable.
int i=0;

void print_number (int num)
{
    if(num>0)
	{
		cout<<++i<<endl;
		print_number(num-1);
	}
}

main ()
{
	cout<< "\t PRINTING NUMBER USING RECURSIION \n\n\n\n";
	
	int num;
	cout<<"Enter limit how many number do you want to print = ";
	cin>>num;
	cout<<endl<<endl<<"printing numbers:\n";
    
	print_number(num);

	return 0;
}

