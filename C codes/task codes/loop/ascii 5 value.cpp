#include <stdio.h>


int main()
{
	int i,num;
	printf("Enter number=");
	scanf("%d",&num);
	
	for (i=num;i<num+5;i++)
	{
		printf("ASCII =  %c\n",i);
	}
	
	

	return 0;
}

