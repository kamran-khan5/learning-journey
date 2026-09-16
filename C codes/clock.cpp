#include <stdio.h>
#include <stdlib.h>

int main()
{
	int totalS,hours,mintes,seconds;
	printf("Enter seconds:");
	scanf("%d",&totalS);
	
	hours=totalS/3600;
	mintes=(totalS-hours*3600)/60;
	seconds=(totalS-hours*3600)%60;
	
	if (hours<10);
	{
		printf("0");
		printf("%d :",hours);
    }
   	
	if (mintes<10)
	{
		printf("0");
		printf("%d :",mintes);
	}

	if (seconds<10)
	{
		printf("0");
		printf(" %d",seconds);
	}


	return 0;
}

