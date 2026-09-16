#include <stdio.h>


int main()
{
	int num,i,count=0;
	printf("Enter the no=");
	scanf("%d",&num);
	
	for (i=1;i<=num;i++)
	{
		count=count+i;
	}
	printf("total sum  = %d",count);

	return 0;
}

