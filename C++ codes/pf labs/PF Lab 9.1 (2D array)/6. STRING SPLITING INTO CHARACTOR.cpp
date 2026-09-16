#include <iostream>
#include <string>
using namespace std;

int main ()
{
	cout<<"\t STRING SPLITING INTO CHARACTOR \n\n\n";
	
    string str;
    cout<<"Enter string to split into alphabets :\n";
    getline (cin,str);
    
    char arr[str.size()];
    
    for (int i=0; i<str.size(); i++)
    {
    	arr[i]=str[i];
	}
    
    for (int i=0; i<sizeof(arr); i++)
    {
    	cout<<arr[i]<<endl;
	}
	return 0;
}

