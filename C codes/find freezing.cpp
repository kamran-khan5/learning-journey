#include <stdio.h>
#include <stdlib.h>

int main()
{
	int temp;
	printf("enter the tempreture(F):");
	scanf("%d",&temp);
	
	if(temp>32)
	printf("the tempreture(%d) is above freezing point",temp);
	else
	printf("the tempreture(%d) is below freezing point",temp);
	return 0;
}

