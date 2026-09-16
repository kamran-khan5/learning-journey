#include <stdio.h>

int main()
{ 
    int num1,num2,num3;
    printf("enter first number:");
    scanf("%d",&num1);
    
    printf("enter second number:");
    scanf("%d",&num2);
    
    printf("enter third number:");
    scanf("%d",&num3);
    
    if (num1>num2)
    printf("first number '%d' is largest number",num1);
    else if(num2>num3)
    printf("second number '%d' is largest number",num2);
    else
    printf("third number '%d' is largest number",num3);
	return 0;
}

