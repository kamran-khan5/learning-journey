#include <stdio.h>


int main()
{
	int num,tnum,i;
	printf("Enter no=");
	scanf("%d",&num);
	tnum=num;
	for (i=1;i<=num;i++)
    {
    	printf("%d\t%d\n",i,tnum);
    	tnum--;
	}
	return 0;
}

