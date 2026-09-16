#include <iostream>
#include <string>
using namespace std;

void fun(int num)
{
	if (num>=10)
	{
		return;
	}
	fun(num+1);
	cout<<num<<endl;
 } 
main ()
{
	fun(0);


	return 0;
}

