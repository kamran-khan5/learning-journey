#include <stdio.h>
#include <stdlib.h>

int main()
{
	int totalsecond;
	int hours,mintes,seconds;
	printf("enter the totalseconds=");
	scanf("%d",&totalsecond);
	
	hours=totalsecond/3600;
	mintes=(totalsecond - hours * 3600) /60;
	seconds=(totalsecond - hours * 3600) % 60;
	printf("%d:%d:%d",hours,mintes,seconds);
	return 0; 
	
}

