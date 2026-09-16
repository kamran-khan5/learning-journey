#include <stdio.h>


int main()
{
	int table,lenght;
	printf("Enter the table no=");
	scanf("%d",&table);
	
	printf("Enter the table lenght=");
	scanf("%d",&lenght);
	
	for (int i=1;i<=lenght;i++)
	{
		printf("%d x %d =%d\n",table,i,table*i);
	}

	return 0;
}

