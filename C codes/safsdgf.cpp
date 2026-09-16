#include <stdio.h>


int main()
{
	int age;
	char cnic,inpk;
	printf("Enter your age:");
	scanf("%d",&age);
	
	

	printf("sorry! your are not eligible");
  
    if (age>18)	
   	printf("Do you have cnic(press 'n' for no / 'y' for yes)?");
   	scanf("%c",&cnic);
   	else
   		{
		   printf("sorry! your are not eligible");
   	
    

    
	if (cnic=='y')
	printf("Are you in pakistan?");
	scanf("%d",&inpk);
	else
		{
		printf("sorry! you must be have cnic");}}
    if (inpk=='y')
	printf("congurat, you can vote");
	
	if (inpk=='n')
	printf("sorry! you must be need to in the pk");


	return 0;
}

