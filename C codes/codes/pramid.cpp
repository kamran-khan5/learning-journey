#include <stdio.h>


int main()
{
	int num,space,i,j,k,value=1;
	
	printf("Enter the no=");;
	scanf("%d",&num);
	space=num-1;
	
	for (i=1;i<=num;i++)
	{
		for (k=space;k>=1;k--)
		{
			printf(" ");
			
		}
		for (j=1;j<=i;j++)
		{
			printf("%d ",value);
			value++;
		}
		printf("\n");
		space--;
	}

	return 0;
}

