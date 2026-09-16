#include <stdio.h>


int main()
{
	int i,num;
	
	printf("enter number:");
	scanf("%d",&num);
	
	for (i=1;i<num;i++)
	{
		printf("%d\n",i);
	}
	
	for (i=num;i>0;i--)
	{
		printf("%d\n",i);
	}
	
	

	return 0;
}

