#include <stdio.h>


int main()
{
	int num,i,j;
	printf("Enter the num :");
	scanf ("%d",&num);
	
	for (i=1 ; i<=num ; i++)
	{
		for (j=1;j<=i;j++)
		{
		    printf("%d",j);
		    
	    }
	    printf("\n",j);
	} 

	return 0;
}

