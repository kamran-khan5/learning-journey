#include <stdio.h>
#include <stdio.h>

int main()
{
	float num1,num2,num3;
	int max,min;
	printf("enter num1=");
	scanf("%f",&num1);
	
	printf("enter num2=");
	scanf("%f",&num2);
	
	printf("enter num3=");
	scanf("%f",&num3);
	 
	max=num1;
	min=num2;
	if (num1<num2)
	{
		max=num2;
		min=num1;
	}
	if (max<num3)
	   max=num3;
	if (num3<min)
	   min=num3;
	   
	printf("maximun number is=%d\n",max);   
	printf("minimun number is=%d\n",min);   
	

	return 0;
}

