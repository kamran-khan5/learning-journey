#include <stdio.h>
#include <stdlib.h>

int main()
{
	float grades,totalsum =0;
	int gradecount=0;
	
	printf("Enter the grade or '-1' for stop:");
	scanf ("%f",&grades);
	
	while(grades!=-1)
	{
		totalsum+=grades;
		gradecount++;
		printf("Enter the grade or '-1' for stop:");
	    scanf ("%f",&grades);
		
	}
	
	printf ("you enter %d grades\n",gradecount);
	if (gradecount!=0)
	{
		printf("your total grades is :%.1f",totalsum/gradecount);
	}
	else
	{
		printf("ERROR... invalid input! Try  again");
	}

	return 0;
}

