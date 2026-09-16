#include <stdio.h>
#include <stdlib.h>

//finding n-th term of arthemathmetic sequence
//an=a1+(n-1)d 

int main ()
{
	float a1,d,an;
	int n;
	printf("Enter first term (a1)=");
	scanf("%f",&a1);
	
	printf("Enter total no of term (n)=");
	scanf("%d",&n);
	
	printf("Enter difference (d)=");
	scanf("%f",&d);

	an= a1+(n-1)*d;
	printf("n_th term of arthmetic sequence=%f\n",an);
	return 0;
	
}
