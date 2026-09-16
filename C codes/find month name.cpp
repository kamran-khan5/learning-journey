#include <stdio.h>
#include <stdlib.h>

int main()
{

	int num;
	printf("Enter month number:");
	scanf("%d",&num);
	
	switch(num)
	{
		case 1:
		printf("Month name:January");
		break;
		
		case 2:
		printf("Month name:Feburary");
		break;
		
		case 3:
		printf("Month name:March");
		break;
		
		case 4:
		printf("Month name:Aprail");
		break;
		
		case 5:
		printf("Month name:May");
		break;
		
		case 6:
		printf("Month name:June");
		break;
		
		case 7:
		printf("Month name:july");
		break;
		
		case 8:
		printf("Month name:Augest");
		break;
		
		case 9:
		printf("Month name:september");
		break;
		
		case 10:
		printf("Month name:Octubar");
		break;
		
		case 11:
		printf("Month name:November");
		break;
		
		case 12:
		printf("Month name:Decsember");
		break;
	}

	return 0;
}

