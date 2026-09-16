#include <stdio.h>
#include <stdlib.h>

int main()
{
	float temp,ntemp;
	char ip_u,op_u;
	printf("Enter the temphereture with unit(k,c,f):");
	scanf("%f",&temp);
	
	printf("enter the unit of input temp:");
	scanf("%c",&ip_u);
	
	printf("Enter the unit in which you want to convert:");
	scanf("%c",&op_u);
	
	if (ip_u=='c' && op_u=='f')
	ntemp=(temp*9/5)+32;
	printf("temp in F:%f",ntemp);
	
	if (ip_u=='c' && op_u=='k')
	ntemp=temp+273.15;
	printf("temp in K:%f",ntemp);
	
	if (ip_u=='f' && op_u=='c')
	ntemp=(temp-32)*9/5;
	printf("temp in C:%f",ntemp);
	
	if (ip_u=='f' && op_u=='k')
	ntemp=(temp-32)*9/5+273.15;
	printf("temp in K:%f",ntemp);
	
	if (ip_u=='k' && op_u=='f')
	ntemp= 9/5*(273.15) + 32;
	printf("temp in F:%f",ntemp);
	
	if (ip_u=='k' && op_u=='c')
	ntemp=273.15-temp;
	printf("temp in C:%f",ntemp);
    
  


	return 0;
}

