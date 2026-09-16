#include <iostream>
#include <string>
using namespace std;

void string_reverse (string str)
{
	int lenght =str.size();
	for (int i=0; i<lenght/2; i++)
	{
		char temp=str[i];
		str[i]=str[lenght-(i+1)];
		str[lenght-(i+1)]=temp;
	}
	cout<<str<<endl;
}

main ()
{
	cout<< "\tSTRING REVERSE\n\n\n\n";

    string str;
    cout<<"Enter string = ";
    getline(cin, str);
    
    string_reverse(str);

}

