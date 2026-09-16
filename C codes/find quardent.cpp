#include <stdio.h>
#include <stdio.h>

int main()
{
	int x,y;
	printf("enter the value of x:");
	scanf ("%d",&x);
    
    printf("enter the value of y:");
	scanf ("%d",&y);
	
	if (x>0 && y>0)
	printf("this number lie in first quradent");
	
	else if(x<0 && y>0)
	printf("this number lie in second quradent");
	
	else if (x<0 && y<0)
	printf("this number lie in third quradent");
	
	else if (x>0 && y<0)
	printf("this number lie in forth quradent");
	
	else
	printf("this number lie in center"); 
	
	return 0;
}

