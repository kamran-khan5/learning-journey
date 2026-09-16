#include <iostream>
using namespace std;

int main ()
{
	cout<< "\t FINDING DIFFERENT NUMBERS IN TWO ARRAY \n\n\n";
	
	int arr1[5],arr2[5];
	cout<<"Enter first array number\n";
	for (int i=0;i<=4;i++)
	{
		cin>>arr1[i];
	}
	
	cout<<"\n\nEnter second array number\n";
	for (int i=0;i<=4;i++)
	{
		cin>>arr2[i];
	}
	
	cout<<"\n\nFIRST ARRAY IS DIFFERENT FROM SECOND ARRAY ON FOLLOWING NUMBERS\n" << endl;
    
    int temp;
	for (int i=0;i<=4;i++)
	{
		int a=0;
		for (int j=0;j<=4;j++)
		{
			
			if (arr1[i]==arr2[j])
			{
				   a++;
			}
			
        }
        if (a==0 && temp!=arr1[i])
        {
        	temp = arr1[i];
        	cout<<arr1[i]<<" is different"<<endl;
		}
        
    }


	return 0;
}
