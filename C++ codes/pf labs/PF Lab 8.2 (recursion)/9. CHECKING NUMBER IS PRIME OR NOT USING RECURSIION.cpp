#include <bits/stdc++.h>
using namespace std;

bool isPrime(int num, int i = 2)
{

    if (num <= 2) return (num == 2) ? true : false; if (num % i == 0) return false; if (i * i > num)
       return true;

    return isPrime(num, i + 1);
}


int main()
{
	cout<< "\t CHECKING NUMBER IS PRIME OR NOT USING RECURSIION \n\n\n\n";
	
    int num;
	cout<<"Enter number to find it is Prime or Not = ";
	cin>>num;
	
	cout<<endl<<endl;
    if (isPrime(num))
    {
       cout << num << " is Prime Number" << endl;
	}
	
    else
    {
       cout << num << " is Not a Prime" << endl;
    }
    return 0;
}
