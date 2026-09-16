#include <stdio.h>
#include <stdlib.h>
#include <math.h>



int findmax2digit(int num)
	{
		if (num>100 || num<9)
		{
			printf("ERROR!  not two digit number\nTry again...");
		}
		else 
		{
			if (num%10 > num/10)
			{
				printf("second number '%d' is greater ",num%10);
			}
			else
			{
				printf("first number '%d' is greater ",num/10);
			}
		}
	}

int main ()
{
	int number;
	printf("Enter 2 digit number = ");
	scanf("%d",&number);
	findmax2digit(number);
	

    return 0;
}

