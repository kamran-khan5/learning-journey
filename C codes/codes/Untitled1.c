#include <stdio.h>
#include <stdlib.h>


int main()
{
	int num;
	int sum=0;
	printf("Enter the number=");
	scanf("%d",&num);

    while (num>=1)
	{
		sum=sum+num;
		num--;
	}

	printf("total sum is =%d \n",sum);

	if (sum%3==0)
	{
		printf("total sum '%d' is divided by 3\n",sum);
	}
	else
	{
		printf("total sum '%d' is not divided by 3\n",sum);
	}

	if (sum%5==0)
	{
		printf("total sum '%d' is divided by 5\n",sum);
	}
	else
	{
		printf("total sum '%d' is not divided by 5\n",sum);
	}
	return 0;
}
