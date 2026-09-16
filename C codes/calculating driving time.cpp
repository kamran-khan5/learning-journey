#include <stdio.h>
#include <stdlib.h>

int main()
{
	float distance,speed;
	printf ("enter ditance between two cities=");
	scanf ("%f",&distance);
	
	printf("enter speed =");
	scanf("%f",&speed);
	
	float time;
	time=distance/speed;
	printf("times take to reach distination point=%f hours",time);
	return 0;
	
}
