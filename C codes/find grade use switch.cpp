#include <stdio.h>
#include <stdio.h>

int main()
{
	char grade;
	printf("enter your grade(A-F)=");
	scanf("%c",&grade);
	
	switch (grade)
	{
		case 'A':
			printf ("Grade is between 90-100\n");
			break;
		
		case 'B':
			printf ("Grade is between 80-90\n");
		    break;
		
		case 'C':
			printf ("Grade is between 70-80\n");
			break;
		
		case 'D':
			printf ("Grade is between 60-70\n");
			break;
			
		case 'F':
			printf ("Grade is below then 60\nSorry you are fail.");
			break;
			
		default:
			printf("ERROR...  Try again");
			
	}

	return 0;
}

