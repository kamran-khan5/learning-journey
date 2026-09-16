#include <stdio.h>
#include <stdio.h>

int main()
{
	int num;
	int reversednum;
	int unit,ten,hunderd;
	printf("enter a 3 digit no=");
	scanf("%d",&num);
	
	unit=num % 10;
	ten=(num/10)%10;
	hunderd=num/100;
	
	reversednum=unit;
	reversednum=reversednum * 10 + ten;
	reversednum=reversednum * 10 +hunderd;
	
	printf("reversed of the num:%d is=%d%d%d",num,unit,ten,hunderd);

	return 0;
}

