#include <stdio.h>


int main()
{
	int num,count=0,sum=0;
	printf("Enter number:");
	scanf("%d",&num);
	
    for (int i=1;i<=num;i++)
    {
    	if (i%2==0)
    	{
    		sum+=i;
			count++;
    		printf("even:%d\n",i);
		}
	}
	printf("number of even no: %d\n",count);
    printf("total sum of even no:%d",sum);
	return 0;
}

