#include <stdio.h>


int main()
{
	float sub1,sub2,sub3;
	
	printf("enter first subject marks:");
	scanf("%f",&sub1);
	
    printf("enter second subject marks:");
	scanf("%f",&sub1);

    printf("enter third subject marks:");
	scanf("%f",&sub1);
	
	float avg;
	avg=(sub1+sub2+sub3)/3;
	printf("average is :%f\n",avg);
	
	if (avg>80);
	printf("congratulations");
	return 0;
}

