#include <stdio.h>
#include <stdlib.h>


int main()
{
	int i,num;
	int sum=0;
	printf("Enter the number=");
	scanf("%d",&num);

    for (i=1;i<=num;i++)
    {
    	if (i%3==0 && i%5==0)
    	{
    		printf("%d id divided by both 3 and 5\n",i);
		}
	}
	return 0;
}
