#include <stdio.h>
#include <stdlib.h>

int main()
{
	int grade;
	do
	{
		printf("Enter grade between 0 to 100 :");
		scanf("%d",&grade);
		printf("thanks! you have enter '%d' legal grade\n\n",grade);
		
	}
    while (grade>=0 && grade<=100);
    printf("sorry! you enter '%d' illegal grade",grade);
	return 0;
}

