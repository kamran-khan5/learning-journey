#include <iostream>  
using namespace std;  
int main()  
{
	cout<<"\t CHECKING NUMBER IS PRIME OR NOT \n\n\n";
  
  int n, i, m=0;  
  cout << "Enter the Number to check Prime: ";  
  cin >> n;  
  //m=n/2;  
  for(i = 2; i < n; i++)  
  {  
      if(n % i == 0)  
      {  
         m++;
           }  
  } 
  if(m != 0)  
      {  
          cout<<"\n\n"<<n<<" Not a prime number"<<endl;  
   	  }
		  else
		  {
		  
		  cout<< "\n\n"<<n<<" Prime number"; 
           }   

  return 0;  
} 

