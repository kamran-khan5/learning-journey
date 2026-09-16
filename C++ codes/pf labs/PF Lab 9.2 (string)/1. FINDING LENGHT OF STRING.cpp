#include <iostream>
#include <string>
using namespace std;

int find_lenght(string str)
{
	int i=0;
	while (str[i])
	{
		i++;
	}
	return i;
}
int main ()
{
	cout<<"\t FINDING LENGHT OF STRING \n\n\n";
	
	string str;
	cout<<"Enter string :\n";
	getline (cin,str);
	
	cout<<"\n\nlenght of string is ="<<find_lenght(str)<<endl;


	return 0;
}

