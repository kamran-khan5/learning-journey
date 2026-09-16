#include <iostream>
#include <string>
using namespace std;

int main ()
{

 int x = 15, y = 23 , z = 67;
 int *p ;
 p=&x;
 
 cout << p<< "   " << *p<< "  " <<x <<endl;
 
 *p = 1234;
cout << p<< "   " << *p<< "  x =  " <<x <<endl;
 p = &y;
cout << p<< "   " << *p<< "  " <<y <<endl;
//p++;
 *p = 1234;
cout << p<< "   " << *p<< "  y =  " <<y <<endl;
p = &z;
cout << p<< "   " << *p<< "  " <<z <<endl;
 *p = 1234;
cout << p<< "   " << *p<< "  z =  " <<z <<endl;

int **pp; 
	p = &y;
	pp=&p;
	int ***q;
	q=&pp;
	cout <<&x <<"  " <<&y <<"  " <<&pp<<" "<<q <<endl;
	***q = 420;

	//*p = 111;
	p++;
	*p = 123;
	cout<<x <<"   "<< y <<"  " <<p;
	
	
	return 0;
}

