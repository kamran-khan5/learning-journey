#include <stdio.h>
#include <stdlib.h>

int main()
{
    float num,pow,ans=1;
	printf("enter the no:");
    scanf("%f",&num);
    
    printf("enter the power:");
    scanf("%f",&pow);
    
    while (pow>0)
    {
    	ans= ans*num;
    	pow--;
	}
    printf("answer :%.1f",ans);
    
    
	return 0;
}

