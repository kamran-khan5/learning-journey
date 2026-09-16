#include <stdio.h>


int main()
{
	int i,num,ans=0,sq=0;
	
	printf("Enter no=");
	scanf("%d",&num);
	
	for (i=1;i<=num;i++)
	{
		sq=i*i;
		ans+=sq;
		
	}
	printf("total sum of squre of no= %d",ans);

	return 0;
}

