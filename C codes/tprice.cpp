#include <stdio.h>
#include <stdlib.h>

int main()
{
	int price,totalprice=0;
	
	do
	{
		printf("Enter the price:");
		scanf("%d",&price);
		totalprice+=price;
}
	while (price!=0);
	printf("total price is :%d",totalprice);	

	return 0;
}

