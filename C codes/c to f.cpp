//temp centigrate converting to fronheight

#include <stdio.h>
#include <stdlib.h>


int main()
{
	float tempc;
	printf("enter temp C=");
	scanf("%f",&tempc);
	
	float result;
	result = (tempc*1.8)+32;
	printf ("temp F =%f",result);
	return 0;

}
