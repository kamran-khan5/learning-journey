#include <stdio.h>


int main()
{
	int ul,ll;
	char op;
	printf("Enter upper limit=");
	scanf("%d",&ul);
	
	printf("Enter lower limit=");
	scanf("%d",&ll);
	
	printf("Enter ordor for assanding 'a' and desending 'd'=");
	scanf(" %c",&op);
	
	if (op=='a')
	{
		for (ll;ll<=ul;ll++)
		{
			printf("%d\n",ll);
		}
	}
	else if (op=='d')
	{
		for (ul;ul>=ll;ul--)
		{
			printf("%d\n",ul);
		}
	}
	else
	{
		printf("invalid input...   Try again");
	}
	

	return 0;
}

