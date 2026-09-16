#include <stdio.h>


int main()
{
	int num,i,j;
	printf("Enter the number=");
	scanf("%d",&num);
	
	for (i=1;i<=num;i++)
	{
		printf("%d",i);
	}
	
	printf("\n\nreverse number\n");
	for (j=num;j>=1;j--)
	{
		printf("%d",j);
	}

	return 0;
}

