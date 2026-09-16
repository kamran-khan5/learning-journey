#include <stdio.h>
#include <stdio.h>

int main()
{
	char grade;
	printf("enter your grade=");
	scanf("%c",&grade);
	
	if (grade=='A' )
	printf ("Grade is between 90-100\n");
	
	else if (grade=='B')
	printf ("Grade is between 80-90\n");
	
	else if (grade=='C')
	printf ("Grade is between 70-80\n");
	
	else if (grade=='D')
	printf ("Grade is between 60-70\n");
	
	else if (grade=='F')
	printf ("Grade is below then 60\nSorry you are fail");
	else
	printf("ERROR...  Try Again");

	return 0;
}

