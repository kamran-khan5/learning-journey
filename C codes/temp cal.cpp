#include <stdio.h>
#include <stdlib.h>


/* 
"ip_u" used for input unit of temphereture.
"op_u" used for output unit of temphereture.
"temp" used for input temphereture.
"ntemp" used for new tempereture or converted temphereture.
*/

 
int main()
{
	float temp,ntemp;
	char ip_u;
	char op_u;
	printf("Enter the temphereture:");
	scanf("%f",&temp);
	
	printf("enter the unit of input temp:");
	scanf(" %c",&ip_u);
    
    printf("Enter the unit in which you want to convert:");
	scanf(" %c",&op_u);
	
	if (ip_u=='c' && op_u=='f')
	{
	ntemp=(temp*9/5)+32;
	printf("temp in F:%f\n",ntemp);
}
	else if (ip_u=='c' && op_u=='k')
	{
	ntemp=temp+273.15;
	printf("temp in K:%f\n",ntemp);
}
	else if (ip_u=='f' && op_u=='c')
	{
	ntemp=(temp-32)*9/5;
	printf("temp in C:%f\n",ntemp);
}
	else if (ip_u=='f' && op_u=='k')
	{
	ntemp=(temp-32)*9/5+273.15;
	printf("temp in K:%f\n",ntemp);
}
	else if (ip_u=='k' && op_u=='f')
	{
	ntemp= 9/5*(273.15) + 32;
	printf("temp in F:%f\n",ntemp);
}
	else if (ip_u=='k' && op_u=='c')
	{
	ntemp=273.15-temp;
	printf("temp in C:%f\n",ntemp);
}
    else
    {
	printf("invalid input ...  ERROR");
}

	return 0;
}

