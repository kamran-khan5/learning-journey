#include <stdio.h>
#include <stdlib.h>

//finding sum of all arthemathmetic sequence.
//Sn=(a1+an)*(n/2).

int main ()
{
	float a1,an,Sn;
	int n;
	printf("Enter first term (a1)=");
	scanf("%f",&a1);
	
	printf("Enter last term (an)=");
	scanf("%f",&an);
	
	printf("Enter total no of term (n)=");
	scanf("%d",&n);
	

	Sn=(a1+an)*n/2;
	printf("the sum of arthmetic sequence=%f\n",Sn);
	return 0;
	
}
