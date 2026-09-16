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
int find_equal(string s1, string s2)
{
	if(find_len(s1)!=find_len(s2))
	{
		return 0;
	}
	for (int i=0; i<find_len(s1);i++)
	{
		if (s1[i]!=s2[i])
		{
			return 0;
		}
	}
	return 1;
}
int main()
{
	string s1,s2;
	getline(cin, s1);
	getline(cin, s2);
    cout<<find_equal(s1,s2);
}
