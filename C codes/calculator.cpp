#include <stdio.h>
#include <stdlib.h>
#include  <math.h>

int main()
{
	int  num1,num2;
	char math;
	
	printf("enter mathematical operator :");
	scanf("%c",&math);
	
	if (math=='-' && math=='+')
	printf("make it process:%c",math);
	else
    {
	
	
	printf("enter first number=");
	scanf("%d",&num1);
	
	printf("enter 2nd number=");
	scanf("%d",&num2);
	
	
	switch (math)
	{
		case '+':
			printf ("%d %c %d=%d",num1,math,num2,num1+num2);
			break;
			
		case '-':
			printf("%d %c %d=%d",num1,math,num2,num1-num2);
			break;
		
		case '*':
			printf("%d %c %d=%d",num1,math,num2,num1*num2);
			break;
		
		case '/':
			if (num2==0)
			printf("ERROR");
			printf("%d %c %d=%d",num1,math,num2,num1/num2);
			break;
			
		case '%':
			printf("%d %c %d=%d",num1,math,num2,num1%num2);
			break;	
			
		default:
			printf("ERROR... Try Again");
			break;
				
	}
	

	return 0;
}

