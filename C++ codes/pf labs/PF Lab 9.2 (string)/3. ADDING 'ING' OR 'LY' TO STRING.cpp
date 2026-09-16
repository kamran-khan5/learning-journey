#include <iostream>
#include <string>
using namespace std;

void add_ing_toString(string str)
{
	int lenght=str.size();

	if (str.size() < 3)
	{
		cout<<str<<endl;
	}
	else if ((str[lenght-3]=='i') && (str[lenght-2]=='n') && (str[lenght-1]=='g') || (str[lenght-3]=='I') && (str[lenght-2]=='N') && (str[lenght-1]=='G'))
	{
		cout<<str+"ly"<<endl;
	} 
	else
	{
	 	cout<<str+"ing"<<endl;
	}
}

int main ()
{
	cout<<"\t ADDING 'ING' OR 'LY' TO THE STRING \n\n\n";
    
	string str;
    cout << "Enter string:\n";
    cin>>str;
    
	add_ing_toString(str);

	return 0;
}

