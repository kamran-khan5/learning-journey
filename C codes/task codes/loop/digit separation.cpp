#include <stdio.h>


int main()
{
	int num,th,hun,ten,unit;
	printf("Enter four digit number =");
	scanf("%d",&num);
	
	th=num/1000;
    hun=(num/100)%10;
    ten=(num/10)%10;
    unit=num%10 ;
    
    printf("%d\n",++th);
    printf("%d\n",++hun);
    printf("%d\n",++ten);
    printf("%d\n",++unit);
    printf("%d%d%d%d",th,hun,ten,unit);
	return 0;
}

