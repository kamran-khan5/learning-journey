#include <stdio.h>


int main()
{
	int num,count=0,sum=0;
	printf("Enter number:");
	scanf("%d",&num);
	
    for (int i=1;i<=num;i++)
    {
    	if (i%2==1)
    	{
    		sum+=i;
			count++;
    		printf("odd:%d\n",i);
		}
	}
	printf("number of odd no: %d\n",count);
    printf("total sum of odd no:%d",sum);
	return 0;
}

