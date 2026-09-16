#include <stdio.h>


int main()
{
	int i,table;
	printf("enter the table number=");
	scanf("%d",&table);
	
	for (i=1;i<=10;i++)
	{
		printf("%d x %d = %d\n",table,i,table*i);
	}

	return 0;
}

