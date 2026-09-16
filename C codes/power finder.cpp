#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n,pow,i,ans=1;
	printf("number:");
	scanf("%d",&n);
	
	printf("power:");
	scanf("%d",&pow);
	
	
	for (i=1;i<=pow;i++)
	{
		ans*=n;
		
	}
	printf("answer:%d",ans);

	return 0;
}

