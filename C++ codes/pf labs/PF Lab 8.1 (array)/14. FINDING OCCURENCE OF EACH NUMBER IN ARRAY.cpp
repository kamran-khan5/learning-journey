#include <bits/stdc++.h>//google copy
using namespace std;

int frequency(int arr[], int size)
{
   bool check[size];
   for(int i=0; i<size; i++)
   {
      check[i] = 0;
   }
   
   for(int i=0; i<size; i++)
   {
        if(check[i]== 1)
		{
            continue;
        }
        
        int count = 1;
        for(int j = i+1; j<size; j++)
	    {
            if (arr[i] == arr[j])
		    {
                check[j] = 1;
                count++;
            }
        }
        
		cout<<"\n\nFrequency of "<<arr[i]<<" is: " << count << endl;
   }
}


int main()
{
	cout<< "\t FINDING OCCURENCE OF EACH NUMBER IN ARRAY \n\n\n";
	
    int size;
	cout<<"Enter array size = ";
	cin>> size;
	 
	int array[size];
	
	cout<<"\n\nEnter "<<size<<" number:\n";
	
	for (int i=0; i<size ; i++)
	{
		cout<<"\nEnter number =";
		cin>>array[i];
	}
   
   frequency(array, size);
   return 0;
}
