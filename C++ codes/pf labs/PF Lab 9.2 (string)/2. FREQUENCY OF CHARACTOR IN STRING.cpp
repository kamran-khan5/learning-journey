#include <iostream>
#include <string>
using namespace std;

void find_frequency(string str)
{
	int count;
	for (int i=0; i<257;i++)
	{
		count=0;
		for (int j=0; j<str.size(); j++)
		{
			if ((int)str[j] ==i )
			{
				count+=1;
			}
		}
		if (count > 0)
		{
			cout<<(char)i<<"    comes    "<<count<<"   times"<<endl;
		}
	}
}
int main ()
{
	cout<<"\tFINDING FREQUENCY OF CHARACTOR IN A STRING\n\n\n";
    string str;
    cout << "Enter string:\n";
    getline(cin, str);
    find_frequency(str);

	return 0;
}

