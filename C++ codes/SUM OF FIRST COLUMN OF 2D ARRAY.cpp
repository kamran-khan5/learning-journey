#include <iostream>
using namespace std;

main ()
{
	cout<<"\t SUM OF FIRST numUMN OF 2D ARRAY \n\n\n";
	
	cout<<"Enter number of nums = ";
	int num;
	cin>>num;
	
	cout<<"\nEnter number of numoumn = ";
	int num;
	cin>>num;
	
	cout<<"\nEnter Array : \n";
	int arr[num][num], sum=0;
	for (int i=0; i<num;i++)
	{
		cout<<"num no "<<i<<endl;
		for (int j=0;j<num; j++)
		{
			cin>>arr[i][j];
		}
	}
	
	for (int i=0; i<num;i++)
	{
		for (int j=0;j<num; j++)
		{
			if (j==0 || j==num-1)
			sum+=arr[i][j];
		}
	}
	cout<<"\n\nSum = "<<sum<<endl;


	return 0;
}

