#include <stdio.h>


int main()
{
	int n;
	printf("enter number of your choice");
	scanf("%d",&n);
	
	int i;
	for(i=1;i<=10;i++)
     {
     	printf("%d*%d=%d\n",n,i,n*i);
	 }
	return 0;
}

