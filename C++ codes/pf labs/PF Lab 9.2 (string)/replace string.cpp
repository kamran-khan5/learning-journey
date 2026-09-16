#include <iostream>
#include <string>
using namespace std;

int find_indexs(string str, string sub_str, int start_search)
{
	if (sub_str.size()<=1)
	{
		for (int i=start_search; i<str.size(); i++)
		{
			if (sub_str[0]==str[i])
			{
				return i;
			}
		}
	}
    int temp,ind;
	for (int i=start_search; i<str.size(); i++)
	{
		temp=0;
		if (sub_str[0]==str[i])
		{
			for (int j=1; j<sub_str.size();j++)
			{      
				if (sub_str[j]!=str[i+j])
				{                
					temp=0; 
					break;           
				}
				else
				{
					temp=1;
					ind=i;
				}
			}
			if (temp==1)
	        {
		        return ind;
	        }
		}
	}
	
	if (temp!=1)
	{
		return -1;
	}
}

void replace(string &new_str, string str, int start_term,int end_term)
{
	for (int i=start_term; i < end_term; i++)
	{
		new_str+=str[i];
	}
}

int main ()
{
	cout<<"\tREPLACE STRING\n\n\n";
	int start_term=0;
	string new_str;
	// start_term USED TO STORE UPDATED STRING.
	
	cout<<"Enter string : ";
	string str;
	getline(cin, str);
	
	cout<<"\n\nEnter replacing string : ";
	string replace_str;
	getline(cin, replace_str);
	
	cout<<"\n\nEnter replace with string : ";
	string sub_str;
	getline(cin, sub_str);
    
    int start_search=0;
    int index = find_indexs(str, sub_str, start_search);
    while(index!=-1)
    {
    	replace(new_str, str, start_term, index);
		replace(new_str, replace_str, 0, replace_str.size());
		start_term = (index + sub_str.size()) ;
		start_search = index +1;
		index = find_indexs(str, sub_str, start_search);
	}
	
    replace(new_str, str, start_term, str.size());
    cout<<"\n\nAfter updating :\n"<<new_str<<endl;
	return 0;
}

