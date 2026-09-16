#include <stdio.h>
#include <stdio.h>
#include <math.h>

int main()
{
	int num,p2,p4,p6,p8;
	printf("enter num =");
	scanf("%d",&num);
	
	p2=num*num;
	p4=num*num*num*num;
	p6=num*num*num*num*num*num;
	p8=num*num*num*num*num*num*num*num;
	
	
	printf ("num^2=%d\n",p2);
	printf ("num^4=%d\n",p4);
	printf ("num^6=%d\n",p6);
	printf ("num^8=%d\n",p8);
	

	return 0;
}

