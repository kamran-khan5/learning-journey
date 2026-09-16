#include <stdio.h>


int main ()
{
	int i,j;
	int rows;
	printf("Enter rows= ");
	scanf(" %d",&rows);
	
	for (i=1;i<=rows;i++)
	{
		for (j=1;j<=rows+1;j++);
		{
			if (j<rows-i-1)
				printf(" ");
				
				else
				printf("*");
					
				
			}
		}
		
	}



