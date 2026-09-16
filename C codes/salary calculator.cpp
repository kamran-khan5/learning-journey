#include <stdio.h>
#include <stdlib.h>

int main ()
{
	float SpH,hours,day,S;
	printf("hourly salary=");
	scanf("%f",&SpH);
	
	printf("daily work hours=");
	scanf("%f",&hours);

	
	printf("how many days you work=");
	scanf("%f",&day);
	
	S=SpH*hours*day;
	printf("your salary =%.1f$",S);
	
	return 0;

	
}
