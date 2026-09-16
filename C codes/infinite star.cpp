#include <stdio.h>
#include <stdlib.h>

int main()
{
	int num,as=0;
	printf("Enter the no of asterick you want to print:");
	scanf("%d",&num);
	
	while (num>as)
	{
		
		printf("*");
		as++;
	}
	printf("\n");

	return 0;
}

