#include <iostream>
using namespace std;

int main()
{
	cout<<"\t FINDING NUMBER IS PALINDROME OR NOT \n\n\n\n";
	
	int num,rem,sum=0,temp;
	    
    cout<<"Enter the Number=";    
    cin>>num;  
	  
    temp=num; 
	   
    while(num>0)    
    {    
        rem=num%10;    
        
		sum=(sum*10)+rem;    
        
		num=num/10;    
    }   
	 
    if(temp==sum)    
    cout<<"\n\nNumber is Palindrome." << endl;
	    
    else    
    cout<<"\n\nNumber is not Palindrome." << endl;


	return 0;
}

