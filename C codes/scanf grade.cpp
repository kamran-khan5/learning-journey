#include <stdio.h>
#include <stdio.h>
int main()
{
	int grade1, grade2, grade3;
	
	printf ("enter grade 1=");
	scanf ("%d",&grade1);
	
	printf ("enter grade 2=");
	scanf ("%d",&grade2);
	
	printf ("enter grade 3=");
	scanf ("%d",&grade3);
	
	double result;
	result = ((double)grade1+grade2+grade3)/3;
	
	printf("average=%f",result);
	
}
