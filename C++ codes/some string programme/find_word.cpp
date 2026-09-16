#include<iostream>
#include<string>
using namespace std;

int find_len(string str)
{
	int i=0;
    while(str[i])
	{
        i++;
    }
    return i;
}
int find_word(string s1, string s2)
{
	int m,i;
	for (i=0; i<find_len(s1); i++)
	{
		m=1;
		if (s2[0]==s1[i])
		{	
			for (int j=1; j<find_len(s2);j++)
			{          
				if (s2[j]!=s1[i+j])
				{                
					m=0;            
					break;
				}
			}
		}
	}
	
	if (m==1)
	{
		return i;
	}
	else
	{
		return -1;
	}
}
int main()
{
	string s1,s2;
	cout<<"Enter string\n";
	getline(cin, s1);
	cout<<"Enter string which do you find\n";
	getline(cin, s2);
    cout<<find_word(s1,s2);           
    return 0;
}
