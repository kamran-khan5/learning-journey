#include <stdio.h>


int main()
{
	int num,c=1;
	printf("enter num:");
	scanf("%d",&num);
	
	for (int i=0;i<100;i++)
	{
		printf("%d x %d =%d\n",num,c,num*c);
		c++;
	}

	return 0;
}

