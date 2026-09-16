#include <stdio.h>
#include <string>
using namespace std;

main ()
{
	char str[3][5];
	
	for(int k=0;k<3; k++)
	fgets(str[k],5,stdin);
	fflush(stdin);
	printf("\n\n\n");
	for (int i=0;i<3; i++)
	{
		for (int j=0;j<5;j++)
		{
//			if (str[i][j]!=);
			printf("%c",str[i][j]);
		}
		printf("\n");
		
	}


	return 0;
}

