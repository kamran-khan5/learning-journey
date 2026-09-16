#include <iostream>
using namespace std;


int find_factorial(int num)
{
	int fact=1;
	for (int i=num; i>1; i--)
	{
		fact=fact*i;
	}
	return fact;
}

int detect_Strong(int num)
{
    
    int digit, sum = 0;
    int temp = num;
    
    while(temp!=0){
        digit = temp % 10;
        
        sum = sum + find_factorial(digit);
        temp /= 10;
    }
    
    return sum == num;
    
}
int main ()
{
	cout << "\tFINDING STRONG NUMBER \n\n\n\n";
	
    int num;
    cout<<"Enter number to check it stong number or not = ";
    cin>> num;
    
    if(detect_Strong(num))
        cout << endl << endl << num << " is Strong Number." << endl;
    else
        cout << endl << endl << num << " is Not Strong Number." << endl;

}
