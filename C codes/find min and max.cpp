#include <stdio.h>
#include <stdio.h>

int main()
{
	float num1,num2;
	printf("enter num1=");
	scanf("%f",&num1);
	
	printf("enter num2=");
	scanf("%f",&num2);
	
	if (num1>num2)
	printf("maximum=%f",num1);
	else
	printf("minimum=%f",num2);

	return 0;
}

