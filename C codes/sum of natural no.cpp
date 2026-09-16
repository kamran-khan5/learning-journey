#include <stdio.h>


int main()
{
	int num,sum=0;
	printf("Enter number:");
	scanf("%d",&num);
	
    for (int i=1;i<=num;i++)
    {
    	sum+=i; //sum=sum+i
	}
	printf("sum of all nature no:%d",sum);

	return 0;
}

