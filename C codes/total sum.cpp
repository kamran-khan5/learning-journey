#include <stdio.h>
#include <stdlib.h>


int main()
{
	int num,sum=0;
	printf("Enter the number=");
	scanf("%d",&num);
	
    while (num>=1)
	{
		sum=sum+num;
		num--;
	}
	
	printf("total sum is =%d",sum);
	return 0;
}

