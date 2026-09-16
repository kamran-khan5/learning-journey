#include <iostream>
#include <string>
using namespace std;

int find_indexs(string str, string sub_str)
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

int main ()
{
	cout<<"\tFIND ALL INDEXS OF A SUBSTRING IN STRING\n\n\n";
    
	string str, sub_str;
    
    cout << "Enter string:\n";
    getline (cin, str);
    
    cout << "\n\nEnter sub_string:\n";
    getline (cin, sub_str);
    
    int index=find_indexs(str , sub_str);
    cout<<"\n\n\n";
    
    if (index!=-1)
    {
    	for (int i=0; i<sub_str.size(); i++)
        {
    	    cout<<sub_str[i]<<"   present on the  "<<index<<" index"<<endl;
    	    index++;
	    }
    }
    else 
    {
    	cout<<"Not Founded"<<endl;
	}

	return 0;
}

