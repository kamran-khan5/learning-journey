#include <stdio.h>


int main()
{
	int num,i,j;
	printf("Enter the num :");
	scanf ("%d",&num);
	
	for (i=1 ; i<=num ;i++)
	{
		j =i;
		
		while (j>0)
		{
			printf("%d", i);
			j--;
		}
		printf("\n");
	} 

	return 0;
}

