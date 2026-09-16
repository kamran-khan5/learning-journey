#include <stdio.h>


int main()
{
	int num;
	printf("Enter no:");
	scanf("%d",&num);
	
	if (num>0)
	{
		printf("%d is greater then 0",num);
		
	}
    else
    {
    	printf("%d is smaller then 0",num);
	}
    
    
	return 0;
}

