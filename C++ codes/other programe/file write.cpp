#include <iostream>
#include <fstream>
#include <string>
using namespace std;

struct date
{
	int day;
	int month;
	int year;
	
	
};
int main ()
{
	struct date today[10];
	fstream file;
	file.open("d:\\asd.txt",ios::out);
	for (int i=0;i<10; i++)
	{
		cout<<"Enter day= ";
		cin>>today[i].day;
		cout<<"Enter month= ";
		cin>>today[i].month;
		cout<<"Enter year= ";
		cin>>today[i].year;
		file<<"\nday is "<<today[i].day<<"\nmonth is "<<today[i].month<<"\nyear is "<<today[i].year<<endl;
	}
	file.close();
	


	return 0;
}

