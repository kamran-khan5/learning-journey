#include <stdio.h>
#include <stdlib.h>

int main()
{
	int num1,num2,num3;
	printf("enter 1st number:");
	scanf("%d",&num1);
	
	printf("enter 2nd number:");
	scanf("%d",&num2);
	
	printf("enter 3rd number:");
	scanf("%d",&num3);
	
	if (num1==0 || num2==0 || num3==0)
	printf("cannot divie by 0. check input and try again!");
	if ((num2%num1==0) || (num1%num2==0) && (num2%num3==0)||(num3%num2==0) && (num1%num3==0)||(num3%num1==0))
	printf("pair of num:%d and num:%d and num:%d is divisible",num1,num2,num3);
	else
	printf ("non divisible");

	return 0;
}

