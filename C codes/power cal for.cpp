#include <stdio.h>


int main()
{
	 float num,pow,ans=1;
	printf("enter the no:");
    scanf("%f",&num);
    
    printf("enter the power:");
    scanf("%f",&pow);
    for (int i=1;i<=pow;i++)
    {
    	ans*=num;
    	ans*num;
	}
    printf("answer:%.1f",ans);
    
    
	return 0;
}

