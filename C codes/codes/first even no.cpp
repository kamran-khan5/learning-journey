#include <stdio.h>


int main()
{
	int i,num;
	printf("enter the number(to print even no)=");
	scanf("%d",&num);
	
	printf("first %d even number\n",num);
	
	for (i=2;i<=num*2;i+=2)
	{
		printf("%d\n",i);
	}
    

	return 0;
}

