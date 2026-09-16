#include <stdio.h>
#include <stdlib.h>

int main()
{
	int num,result;
	printf("Enter the no:");
	scanf("%d",&num);
	
	if (num<0)
	{
		result=num*(-1);
		printf("absalut value is:%d",result);
		
	}
	else
	{
		printf("absalut value is:%d",num);
	}

	return 0;
}

