#include<stdio.h>
int greater(int a[]);

int main()
{
	int a[10],i;
	printf("Enter 10 numbers\n");
	for(i=0; i<10; i++)
	{
		scanf("%d",a[i]);
		greater(a);
	}
}

int greater(int a[])
{
	int b[10],i,max=0;
	for(i=0; i<10;  i++)
	{
		scanf("%d ",&b[i]);
		if(max>greater(a))
		{
			max[i]=greater;
		}
	}
	printf("%d ",max);
}
