#include <iostream>
#include <string>
#include <fstream>
#include<conio.h>
#include<windows.h>
using namespace std;

struct books{
	string id, title, author, edition, subject, language;
};

int total_books=0;
books book[100];



void enter_book_data()
{
	int book_no=0;

	cout<<"\nHow many Books data do you want to enter?"<<endl;

	cin>>book_no;

	for(int i=total_books;i<total_books+book_no;i++)
	{

		cout<<"\n\nEnter data of Books "<<i+1<<endl<<endl;
		
		id:
		
		cout<<"\nEnter Book ID : ";
        	
		cin>>book[i].id;
		
		for(int j=0; j<i; j++)
		{
			if (book[i].id==book[j].id)
			{
				cout<<"\nThis ID is alredy exist. Please enter another ID."<<endl;
				
				goto id;
			}
		}

		cout<<"Enter Book title : ";

		cin>>book[i].title;

		cout<<"Enter Author name: ";

		cin>>book[i].author;

		cout<<"Enter Book Edition: ";

		cin>>book[i].edition;

		cout<<"Enter Book subject: ";

		cin>>book[i].subject;

		cout<<"Enter Book language: ";

		cin>>book[i].language;
		
		fstream b;
		b.open("books data.txt",ios::out|ios::app);
		if (b.is_open())
		{
			b<<"\n\nData of Book no"<<i+1<<endl;
 	    	
 	    	b<<"Book ID: "<<book[i].id<<endl;

	    	b<<"Book Title: "<<book[i].title<<endl;

		    b<<"Author name: "<<book[i].author<<endl;

	    	b<<"Edition: "<<book[i].edition<<endl;

	    	b<<"Subject: "<<book[i].subject<<endl;

		    b<<"Language: "<<book[i].language<<endl;
		    
		    b.close();
		}
		

	}

	total_books+=book_no;

}

void show_book()
{

	if(total_books!=0)
	{

	    for(int i=0;i<total_books;i++)
	    {

 	    	cout<<"\n\nData of Book no "<<i+1<<endl;
 	    	
 	    	cout<<"Book ID: "<<book[i].id<<endl;

	    	cout<<"Book Title: "<<book[i].title<<endl;

		    cout<<"Author name: "<<book[i].author<<endl;

	    	cout<<"Edition: "<<book[i].edition<<endl;

	    	cout<<"Subject: "<<book[i].subject<<endl;

		    cout<<"Language: "<<book[i].language<<endl;

	    }   

    }

    else
	{
    	cout<<"\nNo data is entered"<<endl;
	}

}

void search_book()
{

	if(total_books!=0)
	{
		loop:
        int choice;
        
	    string id, title, author;
	    
	    cout<<"\nPress 1 to search book by ID."<<endl;
		
		cout<<"\nPress 2 to search book by TITLE."<<endl;
		
		cout<<"\nPress 3 to search book by AUTHOR."<<endl;

	    cin>>choice;
	    
	    system("CLS");
	    
	    switch (choice)
	    {
	    	case 1:
	    		
	    		cout<<"\n\nEnter id of book which you want to search = ";
	    		
	    		cin>>id;
	    		
	    		for(int i=0;i<total_books;i++)
	            {

		            if(book[i].id==id)
		            {

            		    cout<<"Data of Book no "<<i+1<<endl;
 	    	
            	    	cout<<"Book ID: "<<book[i].id<<endl;

             	    	cout<<"Book Title: "<<book[i].title<<endl;

               		    cout<<"Author name "<<book[i].author<<endl;

            	    	cout<<"Edition: "<<book[i].edition<<endl;

            	    	cout<<"Subject: "<<book[i].subject<<endl;

             		    cout<<"Language: "<<book[i].language<<endl;

                   		break;
                    }

		           if(i==total_books-1)
		           {
			            cout<<"\nNo such record found"<<endl;
		           }
	    		}
	    		break;
	    		
	    	
			case 2:
	    		
	    		cout<<"\n\nEnter Title of book which you want to search = ";
	    		
	    		cin>>title;
	    		
	    		for(int i=0;i<total_books;i++)
	            {

		            if(book[i].title==title)
		            {

            		    cout<<"Data of Book no "<<i+1<<endl;
 	    	
            	    	cout<<"Book ID: "<<book[i].id<<endl;

             	    	cout<<"Book Title: "<<book[i].title<<endl;

               		    cout<<"Author name "<<book[i].author<<endl;

            	    	cout<<"Edition: "<<book[i].edition<<endl;

            	    	cout<<"Subject: "<<book[i].subject<<endl;

             		    cout<<"Language: "<<book[i].language<<endl;

                   		break;
                    }

		           if(i==total_books-1)
		           {
			            cout<<"\nNo such record found"<<endl;
		           }
	    		}
	    		break;
			     	
            
			case 3:
	    		
	    		cout<<"\n\nEnter Author name of book which you want to search = ";
	    		
	    		cin>>author;
	    		
	    		for(int i=0;i<total_books;i++)
	            {

		            if(book[i].author==author)
		            {

            		    cout<<"Data of Book no "<<i+1<<endl;
 	    	
            	    	cout<<"Book ID: "<<book[i].id<<endl;

             	    	cout<<"Book Title: "<<book[i].title<<endl;

               		    cout<<"Author name: "<<book[i].author<<endl;

            	    	cout<<"Edition: "<<book[i].edition<<endl;

            	    	cout<<"Subject: "<<book[i].subject<<endl;

             		    cout<<"Language: "<<book[i].language<<endl;

                   		break;
                    }

		           if(i==total_books-1)
		           {
			            cout<<"\nNo such record found"<<endl;
		           }
	    		}
	    		break;
			
			default:
				
				cout<< "\n\n\nERROR...  Invalid input"<<endl;
				
				Sleep(4000);
				
				goto loop;
				break;
		
	    }

    }
	else
    {
	cout<<"\nNo data is entered"<<endl;
    }

}

void update()
{

	if(total_books!=0)
	{
		
		loop:
        int choice;
        
	    string id, title, author;
	    
	    cout<<"\nPress 1 to update book by ID."<<endl;
		
		cout<<"\nPress 2 to update book by TITLE."<<endl;
		
		cout<<"\nPress 3 to update book by AUTHOR."<<endl;

	    cin>>choice;
	    
	    system("CLS");
	    
	    switch (choice)
	    {
	    	case 1:
	    		
	    		cout<<"\n\nEnter id of book which you want to update = ";
	    		
	    		cin>>id;
	    		
	    		for(int i=0;i<total_books;i++)
	            {

		            if(book[i].id==id)
		            {

            		    cout<<"Data of Book no "<<i+1<<endl;
 	    	
            	    	cout<<"Book ID: "<<book[i].id<<endl;

             	    	cout<<"Book Title: "<<book[i].title<<endl;

               		    cout<<"Author name "<<book[i].author<<endl;

            	    	cout<<"Edition: "<<book[i].edition<<endl;

            	    	cout<<"Subject: "<<book[i].subject<<endl;

             		    cout<<"Language: "<<book[i].language<<endl;
             		    
             		    cout<<"\n\nEnter new data"<<endl;

             		    id:
		
	                	cout<<"\nEnter Book ID : ";
        	
                 		cin>>book[i].id;
		
                   		for(int j=0; j<i; j++)
	                 	{
                   			if (book[i].id==book[j].id)
			                {
			                   	cout<<"\nThis ID is alredy exist. Please enter another ID."<<endl;
				
				                goto id;
		                   	}
		                }

	            	    cout<<"Enter Book title : ";

                  		cin>>book[i].title;

               	    	cout<<"Enter Author name: ";

            		    cin>>book[i].author;
    
               	    	cout<<"Enter Book Edition: ";

              		    cin>>book[i].edition;

                   		cout<<"Enter Book subject: ";

	                   	cin>>book[i].subject;

              		    cout<<"Enter Book language: "; 
 
              	    	cin>>book[i].language;

                   		break;
                    }

		           if(i==total_books-1)
		           {
			            cout<<"\nNo such record found"<<endl;
		           }
	    		}
	    		break;
	    		
	    	
			case 2:
	    		
	    		cout<<"\n\nEnter Title of book which you want to update = ";
	    		
	    		cin>>title;
	    		
	    		for(int i=0;i<total_books;i++)
	            {

		            if(book[i].title==title)
		            {

            		    cout<<"Data of Book no "<<i+1<<endl;
 	    	
            	    	cout<<"Book ID: "<<book[i].id<<endl;

             	    	cout<<"Book Title: "<<book[i].title<<endl;

               		    cout<<"Author name "<<book[i].author<<endl;

            	    	cout<<"Edition: "<<book[i].edition<<endl;

            	    	cout<<"Subject: "<<book[i].subject<<endl;

             		    cout<<"Language: "<<book[i].language<<endl;

                   		cout<<"\n\nEnter new data"<<endl;

             		    id1:
		
	                	cout<<"\nEnter Book ID : ";
        	
                 		cin>>book[i].id;
		
                   		for(int j=0; j<i; j++)
	                 	{
                   			if (book[i].id==book[j].id)
			                {
			                   	cout<<"\nThis ID is alredy exist. Please enter another ID."<<endl;
				
				                goto id1;
		                   	}
		                }

	            	    cout<<"Enter Book title : ";

                  		cin>>book[i].title;

               	    	cout<<"Enter Author name: ";

            		    cin>>book[i].author;
    
               	    	cout<<"Enter Book Edition: ";

              		    cin>>book[i].edition;

                   		cout<<"Enter Book subject: ";

	                   	cin>>book[i].subject;

              		    cout<<"Enter Book language: "; 
 
              	    	cin>>book[i].language;

                   		break;
						   
                    }

		           if(i==total_books-1)
		           {
			            cout<<"\nNo such record found"<<endl;
		           }
	    		}
	    		break;
			     	
            
			case 3:
	    		
	    		cout<<"\n\nEnter Author name of book which you want to update = ";
	    		
	    		cin>>author;
	    		
	    		for(int i=0;i<total_books;i++)
	            {

		            if(book[i].author==author)
		            {

            		    cout<<"Data of Book no "<<i+1<<endl;
 	    	
            	    	cout<<"Book ID: "<<book[i].id<<endl;

             	    	cout<<"Book Title: "<<book[i].title<<endl;

               		    cout<<"Author name "<<book[i].author<<endl;

            	    	cout<<"Edition: "<<book[i].edition<<endl;

            	    	cout<<"Subject: "<<book[i].subject<<endl;

             		    cout<<"Language: "<<book[i].language<<endl;

                   		cout<<"\n\nEnter new data"<<endl;

             		    id2:
		
	                	cout<<"\nEnter Book ID : ";
        	
                 		cin>>book[i].id;
		
                   		for(int j=0; j<i; j++)
	                 	{
                   			if (book[i].id==book[j].id)
			                {
			                   	cout<<"\nThis ID is alredy exist. Please enter another ID."<<endl;
				
				                goto id2;
		                   	}
		                }

	            	    cout<<"Enter Book title : ";

                  		cin>>book[i].title;

               	    	cout<<"Enter Author name: ";

            		    cin>>book[i].author;
    
               	    	cout<<"Enter Book Edition: ";

              		    cin>>book[i].edition;

                   		cout<<"Enter Book subject: ";

	                   	cin>>book[i].subject;

              		    cout<<"Enter Book language: "; 
 
              	    	cin>>book[i].language;

                   		break;
                    }

		           if(i==total_books-1)
		           {
			            cout<<"\nNo such record found"<<endl;
		           }
	    		}
	    		break;
			
			default:
				
				cout<< "\n\n\nERROR...  Invalid input"<<endl;
				
				Sleep(4000);
				
				goto loop;
				break;
    } 
}
	else
    {
	cout<<"No data is entered"<<endl;
    }

}

void del_book()
{

	if(total_books!=0)
	{

	    int press;

    	cout<<"Press 1 to delete specific record"<<endl;

    	cout<<"Press 2 to delete full record"<<endl;

    	cin>>press;

	    if(press==1)
        {

		    string id;

	    	cout<<"Enter id of employee which you want to delete"<<endl;

    		cin>>id;

     		for(int i=0;i<total_books;i++){

			if(book[i].id==id){

				book[i].id=book[i+1].id;

				book[i].title=book[i+1].title;
				
				book[i].author=book[i+1].author;

				book[i].edition=book[i+1].edition;

				book[i].subject=book[i+1].subject;
				
				book[i].language=book[i+1].language;

				total_books--;

				cout<<"Your required record is deleted"<<endl;

				break;

			}

			if(i==total_books-1){

			cout<<"No such record found"<<endl;

		}

		}

	}

	else if(press==2){

		total_books=0;

		cout<<"\nAll record is deleted"<<endl;

	}

	else{

		cout<<"\nInvalid Input"<<endl;

	}

}else{

	cout<<"\nNo data is entered"<<endl;

}

}
main ()
{
	system("color 1f");
	cout<<"\n\n\t\tLibrary Management System"<<endl;

	  string username,password;

    cout<<"\n\n\n\t\t******Signup******"<<endl;

	cout<<"\t\tEnter new username: ";

	cin>>username;

	cout<<"\t\tEnter new password: ";

	cin>>password;

	cout<<"\t\tYour new id is creating please wait";

	for(int i=0;i<3;i++)

	{

		cout<<".";

		Sleep(500);

	}

	cout<<"\n\t\tYour id created successfully";

	Sleep(2000);

	start:

	system("CLS");

	string usrn,pswd;

	cout<<"\n\n\t\tlibrary Management System"<<endl;

	cout<<"\n\n\n\t\t   LOGIN"<<endl;

	cout<<"\t\tEnter username: ";

	cin>>usrn;

	cout<<"\t\tEnter password: ";

	cin>>pswd;

	if(usrn==username&&pswd==password)

	{

	system("CLS");

	char ch;

	while(1){

	cout<<"\n\nPress 1 to enter data"<<endl;

	cout<<"Press 2 to show data"<<endl;

	cout<<"Press 3 to search data"<<endl;

	cout<<"Press 4 to update data"<<endl;

	cout<<"Press 5 to delete data"<<endl;

	cout<<"Press 6 to logout"<<endl;

	cout<<"Press 7 to exit"<<endl;

	ch=getch();

	system("CLS");

	switch(ch){

		case '1':

			enter_book_data();

			break;

		case '2':

			show_book();

			break;

		case '3':

			search_book();

			break;

		case '4':

			update();

			break;

		case '5':

			del_book();

			break;

		case '6':

			goto start;

			break;

		case '7':

			exit(0);

			break;

		default:

			cout<<"\aInvalid Input"<<endl;

			break;

	}

}

}

  else if(usrn!=username)

  {

  	cout<<"\t\t\aInvalid username please try again";

  	Sleep(3000);

  	goto start;

  }

  else if(pswd!=password)

  {

  	cout<<"\t\t\aInvalid password please try again";

  	Sleep(3000);

  	goto start;

  }

  else{

  	cout<<"\t\t\aInvalid username and password";

  	Sleep(3000);

  	goto start;

  }

	return 0;
}

