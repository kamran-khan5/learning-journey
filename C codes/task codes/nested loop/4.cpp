#include <stdio.h>


int main()
{
	int rows,i,j,k=0;
	printf("enter no of rows=");
	scanf("%d",&rows);
	
	for (i=1;i<=rows;i++)
	{
		for (j=1;j<=rows-i;j++)
		{
			printf(" ");
			
		}
		while (k!=(2*i-1))
		{
			printf("*");
			k++;
			
		}
		k=0;
		printf("\n");
	}

	return 0;
}

