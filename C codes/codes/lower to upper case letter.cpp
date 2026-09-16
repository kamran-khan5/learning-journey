#include <stdio.h>
#include <stdlib.h>
#include <math.h>

char toupper(char letter)
{
	if (letter >= 'a' && letter <= 'z')
	return letter - 'a' + 'A';
	else
	return -1;
}

int main ()
{
	char let;
	printf("Enter any smaller letter =");
	scanf("%c",&let);
	printf("capital letter = %c",toupper(let));
	
    return 0;
}

