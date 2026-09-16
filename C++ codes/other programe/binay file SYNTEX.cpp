#include <iostream>
#include <string>
#include <fstream>
using namespace std;

main ()
{
	int num=5;
	
	cout<<"num which we write in file =" <<num<<endl<<endl;
	
	ofstream file ("asd.bin",ios::binary);
	//file writing syntex.
	file.write( (char*)&num, sizeof(num) );
	file.close();
	
	int temp;
	cout<<"temp before file reading = "<<temp<<"   garbedge value."<<endl<<endl;
	
	ifstream f("asd.bin",ios::binary);
	//file reading syntex.
	f.read( (char*)&temp, sizeof(temp) );
	f.close();
	
	cout<<"temp after file reading = "<<temp<<endl<<endl;
	


	return 0;
}

