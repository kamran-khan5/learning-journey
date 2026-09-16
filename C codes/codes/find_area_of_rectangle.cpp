#include <stdio.h>
#include <stdlib.h>
#include <math.h>

float find_area_of_rectangle(int lenght,int wight) 
{
	float area ;
	area=lenght * wight;
	return area;
	
}

int main ()
{
	float lenght,wight;
	printf("Enter lenght of rectangle=");
	scanf("%f",&lenght);
	printf("Enter wight of rectangle=");
	scanf("%f",&wight);
	printf("area of rectangle = %.2f",find_area_of_rectangle(lenght,wight));
	

    return 0;
}

