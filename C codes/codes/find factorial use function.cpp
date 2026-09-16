#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int findfactorial(int num)
{
	int fact=1;
	for (int i=1;i<=num;i++)
	{
		fact*=i;
	}
	return fact;
}

int main ()
{
	int fnum;
	printf("Enter the number to find its factorial= ");
	scanf("%d",&fnum);
	printf("Factorial of %d  = %d",fnum,findfactorial(fnum));


    return 0;
}

