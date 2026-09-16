#include <stdio.h>
#include <stdlib.h>
#include <math.h>

long long int ninesequence(int lenght)
{
	int i;
	long long int num=0;
	for (i=1;i<=lenght;i++)
	{
		num=num*10+9;
	}
	return num;
}

int main ()
{
	int len;
	printf("Enter the lenght for sequence of 9= ");
	scanf("%d",&len);
	printf("%d",ninesequence(len));


    return 0;
}

