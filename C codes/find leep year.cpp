#include <stdio.h>
#include <stdlib.h>

int main()
{
	int year;
	
	printf("Enter the year (check leap year):");
	scanf("%d",&year);
	
	if (year%400 == 0) 
	{
		printf ("This year is leap year:%d ",year);
		
	}
	
	else if (year%100 == 0)
	{
		printf("This year is not leap year:%d",year);
	}
	
	else if (year%4 == 0) 
	{
		printf ("This year is leap year:%d ",year);
		
	}
	else
	{
		printf("This year is not leap year:%d",year);
	}
	

	return 0;
}

