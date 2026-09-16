#include <stdio.h>


int main()
{
	int num,i=1,ans=0;
	printf("Enter number to sum of natural no=");
	scanf("%d",&num);
	
	while (i<=num)
	{
		ans+=i;
		i++;
	}
	printf("sum of natural num till'%d'=%d",num,ans);

	return 0;
}

