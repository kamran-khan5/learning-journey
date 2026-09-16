#include <stdio.h>


int main()
{
	int i,j,k,r;
	scanf("%d",&r);
	
	for (i=1;i<=r;i++)
	{
		for (j=1;j<=r-1;j++)
		{
			printf("");
			
		}
		while (k!=2*i-1)
		{
			printf("* ");
			k++;
		}
		printf("\n");
	}
	

	return 0;
}

