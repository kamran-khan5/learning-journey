#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int findmax2(int num1,int num2)
{
	if ((num1>9 && num1 <100)&& (num2>9 && num2<100))
    {
		if (num1>num2)
        	return num1;
    	else
        	return num2;
	}
	
	else 
	printf("ERROR! not 2 digit no");
		
}

int main ()
{
	int  n1,n2;
	printf("enter numbers=");
	scanf("%d%d",&n1,&n2);
	printf("max= %d",findmax2(n1,n2));


    return 0;
}

