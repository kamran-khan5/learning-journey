#include <stdio.h>
#include <stdlib.h>
#include <math.h>

char tolower(char letter)
{
	if (letter >= 'A' && letter <= 'Z')
	return letter - 'A' + 'a';
	else
	return -1;
}

int main ()
{
	char let;
	printf("Enter any capital letter =");
	scanf("%c",&let);
	printf("Smaller letter = %c",tolower(let));
	


    return 0;
}

