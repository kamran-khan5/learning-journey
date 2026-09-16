#include <stdio.h>
#include <stdio.h>

int main()
{
	int num;
	int unit,ten,hunderd;
	printf("enter a 3 digit no=");
	scanf("%d",&num);
	
	unit=num % 10;
	ten=(num/10)%10;
	hunderd=num/100;
	printf("sum of the 3 digit=%d",unit+ten+hunderd);
	return 0;


}

