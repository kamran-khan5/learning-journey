#include <iostream>
using namespace std;

main ()
{
	cout<<"\t CHANGE DIAGNOL OF 2D ARRAY \n\n\n";
	
	cout<<"Enter number of nums = ";
	int num;
	cin>>num;
	
	cout<<"\nEnter Array : \n";
	int arr[num][num];
	for (int i=0; i<num;i++)
	{
		cout<<"num no "<<i<<endl;
		for (int j=0;j<num; j++)
		{
			cin>>arr[i][j];
		}
	}
	
	int temp=0;
	for (int i=0; i<num;i++)
	{
		for (int j=0;j<num; j++)
		{
			if (i==0 || i==num-1)
			{
				cout<<arr[j][i]<<"  ";
			}
			else
			{
				cout<<arr[i][j]<<"  ";
			}
		
		}
		cout<<endl;
	}



	return 0;
}

