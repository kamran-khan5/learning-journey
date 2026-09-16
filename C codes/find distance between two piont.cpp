#include <stdio.h>
#include <stdio.h>
#include <math.h>

int main()
{
	float x1,x2,y1,y2;
	float distance;
	
	printf("enter x1=");
	scanf("%f",&x1);
	
	printf("enter y1=");
	scanf("%f",&y1);
	
	printf("enter x2=");
	scanf("%f",&x2);
	
	printf("enter y2=");
	scanf ("%f",&y2);
	
	distance=sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	printf("distance between the point (%.2f,%.2f) and (%.2f,%.2f) is %.2f",x1,x2,y1,y2,distance);

	return 0;
}

