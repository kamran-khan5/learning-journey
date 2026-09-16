#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main ()
{
	int num,i,sum=0;
	printf("Enter number=");
	scanf("%d",&num);
	
	for (i=1;i<=num;i++)
	{
		if (i%3==0 || i%5==0)
		{
		    printf("%d is divide by 3 or 5\n",i);
		    sum+=i;
	    }
	}
	printf("total sum of these no is =%d",sum);


    return 0;
}

