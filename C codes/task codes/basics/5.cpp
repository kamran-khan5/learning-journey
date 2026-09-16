#include <stdio.h>


int main()
{
	int num;
	printf("Enter no:");
	scanf("%d",&num);
	
	if (num>0)
	{
		printf("%d is positive number\n",num);
		num+=10;
		printf("number:%d",num);
	}
    else
    {
    	printf("%d is negative number",num);
    	num-=10;
    	printf("number:%d",num);
	}

	return 0;
}

