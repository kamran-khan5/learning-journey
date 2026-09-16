//temp fronheit converting to centigrate

#include <stdio.h>
#include <stdlib.h>

int main()
{
	float tempf;
	printf("enter temp F=");
	scanf("%f",&tempf);
	
	float result;
	result = (tempf-32)/1.8;
	printf ("temp c =%f",result);
	return 0;
	
}
