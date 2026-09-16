#include <iostream>

using namespace std;

long long int find_occurance(long long int num,int search)
{
    long long int count = 0;
 
    while (num > 0)
	{
        count = (num % 10 == search) ? count + 1 : count;
        //condional operator ^
        num = num / 10;
    }
    
    return count;
}
 

int main()
{
	cout<<"\t FIND DIGIT APPERENCE IN NUMBER \n\n\n\n";
	
	long long int num;
	cout<<"Enter number to find Digit apperence = ";
	cin>>num;
	
	int appearence = 0;
	
	for(int i=0 ; i<10; i++)
	{
		appearence = find_occurance (num, i);
		
		if (appearence > 0)
		{
			cout<<"\n '"<< i << "'   appear "<< appearence << " times.";
		}
	}
 
 
    return 0;
}

