#include <stdio.h>
#include <stdio.h>
#include  <math.h>

int main()
{
	int  num1,num2;
	char math;
	
	printf("enter mathematical operator(+,-,*,/,%%) :");
	scanf("%c",&math);
	
	//use 'if condition' to use only mathematical operation 
	if(math=='+'||math=='-'|| math=='*'||math=='/'|| math=='%')
	{
		printf("enter first number=");
	    scanf("%d",&num1);
	
	    printf("enter 2nd number=");
    	scanf("%d",&num2);
	
	
	    switch (math)
	    {
	    	case '+':
			printf ("%d %c %d=%d",num1,math,num2,num1+num2);
			break;
			
		case '-':
			printf("%d %c %d=%d",num1,math,num2,num1-num2);
			break;
		
		case '*':
			printf("%d %c %d=%d",num1,math,num2,num1*num2);
			break;
		
		case '/':
			if (num2==0)
			printf("if you cannot divide by 0!");
			printf("%d %c %d=%d",num1,math,num2,num1/num2);
			break;
			
		case '%':
			printf("%d %c %d=%d",num1,math,num2,num1%num2);
			break;	
			
		default:
			printf("ERROR... Try Again");
			break;
	    }}
	else
	{
		printf("ERROR use only mathematical operator");
}
	
	

	return 0;
}

