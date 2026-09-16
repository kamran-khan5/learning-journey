#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
	int totalsecond;
	int hours,mintes,seconds;
	printf("enter the totalseconds=");
	scanf("%d",&totalsecond);
	
	hours=totalsecond/3600;
	mintes=(totalsecond - hours * 3600) /60;
	seconds=(totalsecond - hours * 3600) % 60;
	
	if (hours<10)
	    printf("0");
	printf("%d:",hours);
	if (mintes<10)
	    printf("0");
	printf("%d:",mintes);
		if (seconds<10)
     	printf("0");
	printf("%d\n",seconds);
	

	return 0;
}
