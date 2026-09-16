#include <stdio.h>


int main()
{
	int rows,trows,i,ii,j,jj;
	printf("enter no of rows=");
	scanf("%d",&rows);
	trows=rows;
	for (i=1;i<=rows;i++)
	{
		for(j=rows;j>=i;j--)
		{
			printf("*");
		}
		printf("\n");
	}
	
    for (ii=1;ii<=rows;ii++)
    {
    	for(jj==1;jj<=ii;jj++)
    	{
    		printf("*");
    		
		}
		printf("\n");
	}
	return 0;
}

