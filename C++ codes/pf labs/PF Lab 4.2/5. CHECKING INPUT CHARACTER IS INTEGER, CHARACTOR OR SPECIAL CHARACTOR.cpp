#include <iostream>

using namespace std;

main ()
{
	cout<<"\t CHECKING INPUT CHARACTER IS INTEGER, CHARACTOR OR SPECIAL CHARACTOR \n\n\n";
	
	char ch;
	
	cout<<"Enter something = ";
	cin>>ch;
	
	(ch>47 && ch<58)? cout<<endl<<ch<<" is Integer." : ((ch>64 && ch<91) || (ch>96 && ch<123))? cout<<endl<<ch<<" is Charactor." :
		cout<<endl<<ch<<" is Special Charactor.";
	


	return 0;
}

