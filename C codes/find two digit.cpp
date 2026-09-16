#include <stdio.h>
#include <stdio.h>

int main()
{
	int num;
	printf("enter num=");
	scanf ("%d",&num);
	
	if (num>=10 && num<=99)
	printf("num %d is two digit number",num);
	
	else if (num>=100 &&  num<=999)
	printf("num %d is three digit number",num);
	else
	printf("num %d is neither two nor three digit number.",num);

	return 0;
}

