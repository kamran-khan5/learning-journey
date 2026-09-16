#include <iostream>
using namespace std;

int count_occurences(int arr[], int size, int search_num)
{
    int result = 0;
    for (int i=0; i<size; i++)
        if (search_num == arr[i])
          result++;
    return result;
}
 
int main()
{
    cout<< "\t FINDING OCCURENCE OF NUMBER IN ARRAY \n\n\n";
	
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
	
    int search_num;
    cout<<"\n\n\nEnter number to find occurance in array = ";
    cin>>search_num;
    
    if (count_occurences(array, size, search_num))
    cout <<"\n\nOccurences of '" <<search_num<<"' is : " << count_occurences(array, size, search_num) <<"  times."<< endl;
    
    else
    cout<<"\n\n'"<<search_num<<"' is Not present in the Array"<<endl; 
    
    
    return 0;
    }
