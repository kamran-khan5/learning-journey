#include <iostream>
#include <fstream>
#include <Windows.h>

using namespace std;

struct Bank_system
{
	string user_id, f_name, l_name, ph_no, address, cnic;
	double amount;
	
	Bank_system() :user_id(""), f_name(""), l_name(""), ph_no(""), address(""), cnic(""), amount(0) {}
	
	void welcome() 
	{
		cout<<"\n\t\t********************************************"<<endl;
	    cout<<"\t\t\t     MY BANKING SYSTEM"<<endl;
        cout<<"\t\t********************************************\n\n"<<endl;
	}
	
	void info()
	{
		cout << " Please enter your first name: "; 
		cin >> f_name;
		
		cout << "\n Please enter your last name: "; 
		cin >> l_name;
		
		cout << "\n Please enter your phone no.: "; 
		cin >> ph_no;
		
		cout << "\n Please enter your address: "; 
		cin >> address;
		
		cout << "\n Please enter your CNIC: "; 
		cin >> cnic;
		
		cout << "\n Please enter ID for account: "; 
		cin >> user_id;
		
		cout<<"\n\t\tYour new Account is creating please wait";

	    for(int i=0;i<3;i++)
        {

		    cout<<".";	
			Sleep(500);
	    }

	    cout<<"\n\t\tYour id created successfully\n\n\n";
    	Sleep(3000);
	}
	
	void display() 
	{
		cout << "\n Your first name: " << f_name << endl;
		
		cout << "\n Your last name: " << l_name << endl;
		
		cout << "\n Your phone no.: " << ph_no << endl;
		
		cout << "\n Your address: " << address << endl;
		
		cout << "\n Your CNIC: " << cnic << endl;
		
		cout << "\n Your current amount is: " << amount << endl;
	}
};


int main()
{
	system("color 2f");
	
	int key;
	Bank_system user;
	do
	{
		invalid_menu_loop:
			
	    user.welcome();
	
	    cout << "Please select one option from below menu. \n";
        
		not_delete_loop:	
		
		cout << "\n 1. ACCOUNT OPEN. \n\n 2. DEPOSIT AMOUNT. \n\n 3. WITHDRAW AMOUNT. \n\n 4. CHECK BALENCE. \n\n";
	    cout << " 5. UPDATADE RECORD. \n\n 6. DELETE RECORD. \n\n 7. SEARCH RECORD. \n\n 8. EXIT. \n\n ";
		cin >> key;
		
		system("cls");
		
		
		if (key == 1)
		{
			cout<<"\n\t\t********************************************"<<endl;
	        cout<<"\t\t\t     ACCOUNT OPENING  "<<endl;
            cout<<"\t\t********************************************\n\n"<<endl;
			
			user.info();
			
			ofstream file("Reg_users.dat",ios::app);
			file.write( (char*)&user, sizeof(user) );
			file.close();
			
			user.display();
			Sleep(5000);
			system("cls");
		}
		
		
		
		else if (key == 2) 
		{
			cout<<"\n\t\t********************************************"<<endl;
	        cout<<"\t\t\t     AMOUNT DEPOSITING "<<endl;
            cout<<"\t\t********************************************\n\n"<<endl;
            
			string id;
			int amount = 0,count=0;
			
			cout << "\n Please enter your ID: "; 
			cin >> id;
			
			ifstream u("Reg_users.dat");
			while (u.read( (char*)&user , sizeof(user) ))
			{
				if (id == user.user_id)
				{
					ofstream file("Reg_users_temp.dat", ios::app);
					
					cout << "\n Name of account holder is: " << user.f_name << " " << user.l_name << endl;
					cout << "\n Current amount is: " << user.amount << endl;
					
					cout << "\n Please enter Depositing amount: ";
					cin >> amount;
					
					user.amount += amount;
					cout << "\n Name of account holder is: " << user.f_name << " " << user.l_name << endl;
					cout << "\n Current amount is: " << user.amount << endl;
					
					file.write( (char*)&user, sizeof(user) );
					ifstream u("Reg_users.dat");
					while (u.read( (char*)&user, sizeof(user) ))
					{
						if (id != user.user_id)
						{
							file.write( (char*)&user, sizeof(user) );
						}
					}
					file.close(); 
					count += 1;
				
				}
				else 
				{
					cout << "\n Computer is either searching or wasn`t able to find your record. \n";
				}
			}
			
			Sleep(5000);
			
			system("cls");
			
			u.close();
			
			if (count >= 1)
			{
				remove("Reg_users.dat");
				rename("Reg_users_temp.dat", "Reg_users.dat");
			}
		}
		
		
		
		else if (key == 3) 
		{
			cout<<"\n\t\t********************************************"<<endl;
	        cout<<"\t\t\t     AMOUNT WITHDRAWING "<<endl;
            cout<<"\t\t********************************************\n\n"<<endl;
 			
			string id; 
			int amount = 0, count = 0;
			
			cout << "\n Please enter your ID: ";
			cin >> id;
			
			ifstream u("Reg_users.dat");
			
			while (u.read((char*)&user, sizeof(user)))
			{
				if (id == user.user_id)
				{
					ofstream file("Reg_users_temp.dat", ios::app);
					cout << "\n Name of account holder is: " << user.f_name << " " << user.l_name << endl;
					cout << "\n Current amount is: " << user.amount << endl;
			        
					low_balence:		
					
					cout << "\n Please enter withdrawing amount: "; 
					cin >> amount;
					
					if (amount < user.amount)
					{
						user.amount -= amount;
					}
					
					else 
					{
						cout << "\n\n Amount being withdrawn is more than amount avaiable in the account.\n";
						goto low_balence;
					}
					
					cout << "\n Name of account holder is: " << user.f_name << " " << user.l_name << endl;
					cout << "\n Current amount is: " << user.amount << endl;
					
					file.write((char*)&user, sizeof(user));
					ifstream u("Reg_users.dat");
					while (u.read( (char*)&user, sizeof(user) ))
					{
						if (id != user.user_id)
						{
							file.write((char*)&user, sizeof(user));
						}
					}
					file.close(); 
					count += 1;

				}
				
				else 
				{
					cout << "\n Computer is either searching or wasn`t able to find your record. \n";
				}
			}
			
			Sleep(5000);
			system("cls");
			u.close();
			
			if (count >= 1)
			{
				remove("Reg_users.dat");
				rename("Reg_users_temp.dat", "Reg_users.dat");
			}
		}
		
		
		
		else if (key == 4) 
		{
			cout<<"\n\t\t********************************************"<<endl;
	        cout<<"\t\t\t     CHECK BALENCE "<<endl;
            cout<<"\t\t********************************************\n\n"<<endl;
 
			string id;
			cout << "\n Please enter your ID: "; 
			cin >> id;
			ifstream u("Reg_users.dat");
			while (u.read( (char*)&user, sizeof(user) ) )
			{
				if (id == user.user_id)
				{
					cout << "\n Name of account holder is: " << user.f_name << " " << user.l_name << endl;
					cout << "\n Current amount is: " << user.amount << endl;
				}
				else 
				{
					cout << "\n Computer is either searching or wasn`t able to find your record. \n";
				}
			}
			Sleep(5000);
			system("cls");
			u.close();
		}
		
		
		
		else if(key == 5)
		{
			cout<<"\n\t\t********************************************"<<endl;
	        cout<<"\t\t\t     UPDATADE RECORD "<<endl;
            cout<<"\t\t********************************************\n\n"<<endl;
 			
		    string id; 
		    int count = 0; 
		    char key, opt;
		    
			cout << "\n Please enter your ID: ";
		    cin >> id;
		    
			ifstream u("Reg_users.dat");
		    
			while (u.read((char*)&user, sizeof(user)))
		    {
			    if (id == user.user_id)
			    {
				    user.display();
				    cout << "=================================================================\n";
				
				    reupdate:
					
					ofstream file("Reg_users_temp.dat", ios::app);
								
				    cout << "\n 1. To update first name (Press f). \n 2. To update last name (Press l). \n";
				    cout << " 3. To update phone no. (Press p). \n 4. To update address (Press a). \n 5. To update cnic (Press c). \n";
				    cin >> key;
				    
					if (key == 'f' || key == 'F')//for updating first name
				    {
					    cout << "\nPlease enter your new first name: "; 
					    cin >> user.f_name;
					
					    file.write((char*)&user, sizeof(user));
					
					    ifstream u("Reg_users.dat");
					    
						while (u.read( (char*)&user, sizeof(user) ) )
					    {
						    if (id != user.user_id)
						    {
							    file.write( (char*)&user, sizeof(user) );
						    }
					    }
				    }
				    
				    else if (key == 'l' || key == 'L')//for updating last name 
				    {
					    cout << "\n Please enter your new last name: "; 
					    cin >> user.l_name;
					
					    file.write((char*)&user, sizeof(user));
					    ifstream u("Reg_users.dat");
					
					    while (u.read( (char*)&user, sizeof(user) ))
					    {
						    if (id != user.user_id)
						    {
							    file.write( (char*)&user, sizeof(user) );
						    }
					    }
				    }
				
				    else if (key == 'p' || key == 'P') //for updating phone number 
				    {
					    cout << "\n Please enter your new number: "; 
						cin >> user.ph_no;
					
					    file.write((char*)&user, sizeof(user));
					    ifstream u("Reg_users.dat");
					
					    while (u.read( (char*)&user, sizeof(user) ))
					    {
						    if (id != user.user_id)
						    {
							    file.write((char*)&user, sizeof(user));
						    }
					    }
				    }
				
				    else if (key == 'a' || key == 'A') //for updating address 
				    {
					    cout << "\n Please enter your new address: "; 
					    cin >> user.address;
					
					    file.write( (char*)&user, sizeof(user) );
					    ifstream u("Reg_users.dat");
					
					    while (u.read((char*)&user, sizeof(user)))
					    {
						    if (id != user.user_id)
						    {
							    file.write((char*)&user, sizeof(user));
						    }
					    }
				    }
				
				    else if (key == 'c' || key == 'C') //for updating CNIC number
				    {
					    cout << "\n Please enter your new CNIC: "; 
					    cin >> user.cnic;
					
					    file.write((char*)&user, sizeof(user));  
     					ifstream u("Reg_users.dat");
	    				while (u.read((char*)&user, sizeof(user)))
		    			{
			     			if (id != user.user_id)
				    		{
					    		file.write((char*)&user, sizeof(user));
					    	}
					    }
				    }
				
				    cout << "\n Do you want to update record again? (y/n) ";
				    cin >> opt;
				
		    		if (opt == 'y' || key == 'Y')
    				{
    					file.close(); 
						u.close();
    											
						remove("Reg_users.dat");
			            rename("Reg_users_temp.dat", "Reg_users.dat");
	    				goto reupdate;
		    		}
			    	else 
    				{
	    				file.close(); 
		    			count += 1;
			    	}
			    }
			
			    else 
			    {
				    cout << "\n\nComputer is either searching or wasn`t able to find your record. \n";
			    }
		    }
		
		    Sleep(5000);
		    system("cls");
		    u.close();
		
		    if (count >= 1)
		    {
			    remove("Reg_users.dat");
			    rename("Reg_users_temp.dat", "Reg_users.dat");
		    }
        }
        
		
		
		else if (key == 6) 
		{
			cout<<"\n\t\t********************************************"<<endl;
	        cout<<"\t\t\t     DELETE RECORD "<<endl;
            cout<<"\t\t********************************************\n\n"<<endl;
 			
		    string id; 
			int count = 0; char key;
		    cout << "\n Please enter your ID: "; 
			cin >> id;
		    
			ifstream u("Reg_users.dat");
		    
			while (u.read( (char*)&user, sizeof(user) ))
		    {
			    if (id == user.user_id)
			    {
				    ofstream file("Reg_users_temp.dat", ios::app);
				    cout << "\n Name of account holder is: " << user.f_name << " " << user.l_name << endl;
				    cout << "\n Current amount is: " << user.amount << endl;
				    
					cout << "\n Do you really want to delete the record? (y/n) ";
				    cin >> key;
				    
					if (key == 'y' || key == 'Y' )
				    {
					    ifstream u("Reg_users.dat");
					    
						while (u.read( (char*)&user, sizeof(user) ))
					    {
						    if (id != user.user_id)
						    {
							    file.write((char*)&user, sizeof(user));
						    }
					    }
					    
					    cout<<"\n\n \t Your Acount is Deleting";
					    for(int i=0; i<3; i++)
					    {
					    	cout<<" .";
					    	Sleep(1000);
						}
						cout<<"\n \t Your Account is successfuly Deleted.";
				    }
				    
					else 
					{
					    goto not_delete_loop;
				    }
				
				    file.close(); 
					count += 1;

			    }
			    
				else 
				{
				    cout << "\n Computer is either searching or wasn`t able to find your record. \n";
			    }
		    }
		    
			Sleep(5000);
		    system("cls");
		    u.close();
		
		    if (count >= 1)
		    {
			    remove("Reg_users.dat");
			    rename("Reg_users_temp.dat", "Reg_users.dat");
		    }
        }
		
		
		
		else if (key == 7) 
		{
			cout<<"\n\t\t********************************************"<<endl;
	        cout<<"\t\t\t     SEARCH RECORD "<<endl;
            cout<<"\t\t********************************************\n\n"<<endl;
 			
		    string id;
		    cout << "\n Please enter your ID: "; 
			cin >> id;
			
		    ifstream u("Reg_users.dat");
		    
			while (u.read( (char*)&user, sizeof(user) ))
		    {
			    if (id == user.user_id)
			    {
				    user.display();
			    }
			    else 
				{
				    cout << "\n Computer is either searching or wasn`t able to find your record. \n";
			    }
		    }
			Sleep(5000);
		    system("cls");
		    u.close();
        }
        
        
        else if (key >8)
        {
        	cout<<"\n\t\t********************************************"<<endl;
	        cout<<"\t\t\t     MY BANKING SYSTEM"<<endl;
            cout<<"\t\t********************************************\n\n"<<endl;
            
			cout<<"\n \tERROR... INVALID INPUT.\n\n\n";
			char opt;
			
			cout<<"\n Do you want to try again (y/n)?";
			cin>>opt;
			
			if ( opt=='y' || opt=='Y')
			{
				system("cls");
				goto invalid_menu_loop;
			}
			
			else
			{
				break;
			}
		}
	} while (key != 8);
	
	system("cls");
	user.welcome();
	
	cout << "\t\t\t\t\t THANK YOU \n\t\t\t\t   For visiting our bank. \n\t\t\t\t\t\t"<<endl;
}
