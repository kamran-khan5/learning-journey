#include <stdio.h>
#include <stdlib.h>

int main()
{
	int day,month,year,leapyear;
	
	printf("Enter the day:");
	scanf("%d",&day);
	
	printf("Enter the month:");
	scanf("%d",&month);
	
	printf("Enter the year:");
	scanf("%d",&year);
	
	if (month==2)
	{
		if (year % 4 == 0 && (year % 100 !=0 || year % 400== 0))
		leapyear=1;
		day+=1;
	 } 
	
	if ((day>0 && day <31) && (month==1))
	{
		day++;
		printf("%d/%d/%d",day,month,year);	
	}
	
	else if ((day==31) && (month==1))
	{
		month++;
		printf("%d/%d/%d",day,month,year);	
	}
	
	else if ((day>0 && day <28) && (month==2))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}
	
	else if ((day>0 && day <29) && (month==2) && (leapyear ==1))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
    }
	else if ((day==28) && (month==2))
	{
		month++;
		printf("%d/%d/%d",day,month,year);	
	}

	else if ((day==2) && (month==2) && (leapyear ==1))
	{
		month++;
		printf("%d/%d/%d",day,month,year);	
	}	
	else if ((day>0 && day <31) && (month==3))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}
	
	else if ((day==31) && (month==3))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }
	
	else if ((day>0 && day <30) && (month==4))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}
	
	else if ((day==30) && (month==4))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }
	
	else if ((day>0 && day <31) && (month==5))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}
	
	else if ((day==31) && (month==5))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }
	
    else if ((day>0 && day <30) && (month==6))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}
   	
	else if ((day==30) && (month==6))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }

    else if ((day>0 && day <31) && (month==7))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}

	else if ((day==31) && (month==7))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }

    else if ((day>0 && day <31) && (month==8))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}

    else if ((day==31) && (month==8))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }

    else if ((day>0 && day <30) && (month==9))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}

    else if ((day==30) && (month==9))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }

    else if ((day>0 && day <31) && (month==10))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}

    else if ((day==31) && (month==10))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }
    
    else if ((day>0 && day <30) && (month==11))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}
    
    else if ((day==30) && (month==11))
	{
		month++;
		printf("%d/%d/%d",day,month,year);
    }
    
    else if ((day>0 && day <31) && (month==12))
	{
		day++;
		printf("%d/%d/%d",day,month,year);
	}
    
    else if ((day==31) && (month==12))
	{
		year++;
		printf("%d/%d/%d",day,month,year);
    }
    else
    {
    	printf("ERROR...   Try  again");
	}

	return 0;
}

