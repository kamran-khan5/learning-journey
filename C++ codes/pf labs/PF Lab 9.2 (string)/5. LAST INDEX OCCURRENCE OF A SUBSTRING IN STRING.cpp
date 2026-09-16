#include <iostream>
#include <string>
using namespace std;

int ind_sub_str2 (string str, string sub_str)
{
	if (sub_str.size()<=1)
	{
		for (int i=0; i<str.size(); i++)
		{
			if (sub_str[0]==str[i])
			{
				return i;
			}
		}
	}
    int temp,ind;
	for (int i=0; i<str.size(); i++)
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
					ind=(i+sub_str.size()-1);
				}
			}
			if (temp==1)
	        {
		        return ind;
	        }
		}
	}
	
	if (temp==1)
	{
		return ind;
	}
	else
	{
		return -1;
	}	
}
int main ()
{
	cout<<"\t FIND INDEX THE LAST OCCURRENCE OF A SUBSTRING IN STRING \n\n\n";
    
	string str, sub_str;
    
    cout << "Enter string:\n";
    getline (cin, str);
    
    cout << "\n\nEnter sub_string:\n";
    getline (cin, sub_str);
    
    cout<<"\n\nSub_string '"<<sub_str<<"' present on '"<< ind_sub_str2(str , sub_str)<<"' index(last index) of a string.";


	return 0;
}

