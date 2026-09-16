#include <stdio.h>
#include <stdio.h>

int main()
{
	int num;
	printf("enter number:");
	scanf("%d",&num);
	
	if(num<0)
	printf("Absalute value is:|%d|",(-1)*num);
	else 
	printf("Absalute value is:|%d|",num);
	
	

	return 0;
}

