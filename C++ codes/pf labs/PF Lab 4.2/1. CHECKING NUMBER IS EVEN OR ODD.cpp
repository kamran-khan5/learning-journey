#include <iostream>
using namespace std;

int main ()
{
	
	cout<<"\t CHECKING NUMBER IS EVEN OR ODD \n\n\n";
	
	int num;
	cout << "Enter number to check it is even or odd = ";
	cin >> num ;
	
	(num%2==0)?cout<<endl<< num<< " is even"<<endl : cout <<endl<< num << " is odd"<<endl;
    
    
	return 0;
}

