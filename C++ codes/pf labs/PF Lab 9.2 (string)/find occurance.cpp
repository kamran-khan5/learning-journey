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

int find_occ(string str, string sub_str)
{
	int occ=0;
	if (find_lenght(sub_str)<=1)
	{
		for (int i=0; i<find_lenght(str); i++)
		{
			if (sub_str[0]==str[i])
			{
				occ++;
			}
		}
		return occ;
	}
    int temp;
	for (int i=0; i<find_lenght(str); i++)
	{
		temp=0;
		if (sub_str[0]==str[i])
		{
			for (int j=1; j<find_lenght(sub_str);j++)
			{      
				if (sub_str[j]!=str[i+j])
				{                
					temp=0; 
					break;           
				}
				else
				{
					temp=1;
				}
			}
			
			
			if (temp==1)
	        {
		        occ++;
	        }
		}
	}
	
	return occ;
}

int main ()
{
	cout<<"\tFIND ALL occurance OF A SUBSTRING IN STRING\n\n\n";
    
	string str, sub_str;
    
    cout << "Enter string:\n";
    getline (cin, str);
    
    cout << "\n\nEnter sub_string:\n";
    getline (cin, sub_str);
    
    int occ = find_occ(str , sub_str);
    cout<<"\n\n\n";
    
    cout<<"total occurance ="<<occ<<endl;


	return 0;
}

