#include<stdio.h> 
#include <math.h>
#include <windows.h>


int main () 
{
		system("color 2f");
		
    printf("\t SCIENTIFIC CALCULATOR\n\n\n");
    char choice; 
    
    printf("Enter the number which mathematical operation do you want to perform\n");
    printf("For Addition press '1'\nFor Subtraction press '2'\nFor Multiplication press '3'\nFor Division press '4'\n");
    printf("For Finding Power press '5'\nFor Finding SIN press '6'\nFor Finding COS press '7'\nFor Finding TANGENT press '8'\nFor Finding UNDER ROOT press '9'\n");
	scanf("%c",&choice);
    
    system ("CLS");
    float val1, val2, result;
    
    switch (choice)
    {
    	case '1':
    		
    		printf("Enter the first value (addition): "); 
            scanf("%f", &val1);
            
           	printf("\nEnter the second value (addition): "); 
            scanf("%f", &val2);
            
    		result = val1+val2;
    		printf("\nAddition of %f and %f = %f",val1, val2, result);
    		break;
    		
    	case '2':
    		printf("\nEnter the first value (subtraction): "); 
            scanf("%f", &val1); 
            
            printf("\nEnter the second value (subtraction): "); 
            scanf("%f", &val2); 
            
			result = val1-val2;
    		printf("\nSubtraction of %f and %f = %f",val1, val2, result);
    		break;
    		
    	case '3':
    		printf("\nEnter the first value (multiplication): "); 
            scanf("%f", &val1); 
            
			printf("\nEnter the second value (multiplication): "); 
            scanf("%f", &val2); 
            
			result=val1*val2;
    		printf("\nMultiplication of %f and %f = %f",val1, val2, result);
    		break;
			
		case '4':
			printf("\nEnter the first value (division): "); 
            scanf("%f", &val1); 
            
			printf("\nEnter the second value (division): "); 
            scanf("%f", &val2); 
            
			result=val1/val2; 
            printf("\nDivision of %f and %f = %f",val1, val2, result);
    		break;
			
		case '5':
			printf("Enter the base value: "); 
            scanf("%f", &val1); 
            
			printf("\nEnter the exponent value: "); 
            scanf("%f", &val2); 
			 
            result=pow(val1,val2);
            printf("\nThe power of %f numbers is: %f ", val1,pow(val1,val2));
    		break;
			
		case '6':
			printf("Enter the value to find SIN: "); 
            scanf("%f", &val1); 

            result=sin(val1);
            printf("\nThe sin of %f numbers is :%f",val1, result);
    		break;
			
		case '7':
			printf("Enter the value to find COS: "); 
            scanf("%f", &val1);  
            
			result=cos(val1); 
            printf("\nThe COS of %f numbers is :%f",val1, result);
    		break;
			
		case '8':
			printf("Enter the value to find TANGENT: "); 
            scanf("%f", &val1); 

            result=tan(val1); 
            printf("\nThe tangent of %f numbers is :%f",val1, result);
    		break;
			
		case '9':
			printf("Enter the value to find UNDER ROOT: "); 
            scanf("%f", &val1); 

            result=sqrt(val1); 
            printf("\nThe Under_root of %f numbers is :%f",val1, result);
    		break;	
			
		default:
			printf("INVALID INPUT\nTRY AGAIN... ");	
			break;				
	}

}
