#include <iostream>
using namespace std;

int find_presence(int arr[],int size, int search)
{
    int index;
    
    for (int i=0; i<size; i++)
    {
    	if (arr[i] == search)
    	{
    		return i;
		}
	}
	return -1;
}


int main ()
{
	cout<< "\t FIND PRESENCE OF NUMBER IN ARRAY \n\n\n";
	
	int size;
	cout<<"Enter array size = ";
	cin>> size;
	 
	int array[size];
	
	cout<<"\n\nEnter "<<size<<" number:\n";
	
	for (int i=0;i<size;i++)
	{
		cout<<"\nEnter number =";
		cin>>array[i];
	}
	
	int search_num;
	cout<<"\n\nEnter number which do you want to search = ";
	cin>>search_num;
	
	int index= find_presence(array, size, search_num);
	if(index != -1)
	{
		cout<<"\n\n"<<search_num<<" is present on index number = "<< index << endl;
	}
	else
	{
		cout<< "\n\nNot present"<<endl;
	}
	
	
}

