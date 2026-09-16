#include <stdio.h>
#include <stdlib.h>
#include <math.h>



long findsequence(int lenght)
{
	if (lenght<=9)
	{
		int num=0;
		for (int i=0;i<lenght;i++)
		{
			num=num*10 + i+1;
		}
		return num;
	}
	else
	{
		num=sequence9(lenght);
	}
	return num;
    }
}

long sequence9(int lenght)
{
	int i;
	long num=0;
	for (i=1;i<=lenght;i++)
	{
		num=num*10+9;
	}
	return num;
}


int main ()
{
	int len;
	printf("Enter the lenght for sequence = ");
	scanf("%d",&len);
	printf("%ld",findsequence(len));


    return 0;
}

