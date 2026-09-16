#include <iostream>
#include <string>
using namespace std;

void caesar_encryption(string str, int num)
{
	string new_str;
	cout<<str.size()<<endl;
	for (int i=0; i<str.size(); i++)
	{
		if (str[i]>='A' && str[i]<= 'Z')
		{
			int temp=(int)str[i] + num;
			if (temp > 90)
			{
				temp=(temp-90) + 64;
				new_str +=(char)temp;
			}
			else if (temp < 65)
			{
				temp+= 26;
				new_str +=(char)temp;
			}
			else
			{
				new_str +=(char)temp;
			}
		}
		else if ((str[i]>='a' && str[i]<= 'z'))
		{
			int temp=(int)str[i] + num;
			if (temp > 122)
			{
				temp=(temp-122) + 96;
				new_str +=(char)temp;
			}
			else if (temp < 97)
			{
				temp+= 26;
				new_str +=(char)temp;
			}
			else
			{
				new_str +=(char)temp;
			}
		}
		else
		{
			new_str[i]=str[i];
		}
	}
	cout<<new_str;
}


 main ()
{
    cout<<"\t CAESAR ENCRYPTION \n\n\n";
    
	string str;
    
    cout << "Enter string:\n";
    getline (cin, str);
    
    int num;
    cout<<"\n\nEnter number for Caesar encryption = ";
    cin>>num;
    
    caesar_encryption( str, num);
    return 0;
}

