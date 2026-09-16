#include <iostream>
using namespace std;

int split_and_sum(int num)
{
	int temp,sum=0;
	while(num!=0)
	{
		temp=num%10;
		num=num/10;
		sum=sum+temp;
	}
	return sum;
}

int main ()
{
	cout<<"\tSPLITING NUMBER AND CHECKING ITS DIVIDING THAT NUMBER\n\n\n";
	
	int num;
	for (int i=1; i<=1000; i++)
	{
		num=split_and_sum(i);
		if (i%num==0)
		{
			cout<<i<<endl;
		}
	}
	return 0;
}

