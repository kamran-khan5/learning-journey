#include <stdio.h>


int main()
{
	int num,tnum,i,ans=0;
	printf("Enter number:");
	scanf("%d",&num);
	tnum=num;
	for (i=0;i<num;i++)
	{
		ans=ans+tnum;
		tnum--;
		
	}
	printf("total sum is:%d",ans);

	return 0;
}

