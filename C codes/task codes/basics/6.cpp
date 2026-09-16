#include <stdio.h>


int main()
{
	int num1,num2;
	printf("Enter first number:");
	scanf("%d",&num1);
	
	printf("Enter second number:");
	scanf("%d",&num2);
	
	if (num1>num2)
	{
		printf("First value is greater '%d'\n",num1);
		num1*=2;
		printf("value after multipling 2=  %d",num1);
		
	}
    else
    {
    	printf("second value is greater '%d'\n",num2);
    	num2+=2;
    	printf("value after adding 2=  %d",num2);
	}

	return 0;
}

