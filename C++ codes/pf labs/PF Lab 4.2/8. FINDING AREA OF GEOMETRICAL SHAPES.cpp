#include <iostream>

using namespace std;

main ()
{
	cout<<"\t FINDING AREA OF GEOMETRICAL SHAPES \n\n\n";
	
	cout<<"Press '1' for finding area of Squre."<<endl;
	cout<<"Press '2' for finding area of Circle."<<endl;
    cout<<"Press '3' for finding area of Triagle."<<endl;
    cout<<"Press '4' for finding area of Rectangle."<<endl;
    
    int choice;
    cout<<"\nWhich geometrical shape area do you want to find = ";
    cin>>choice;
    
    switch(choice)
	{
		case 1:
			float lenght;
	        cout<<"\nEnter the lenght of one side of Squre (In feet)= ";
	        cin>>lenght;
	        cout<<"\nArea of Squre = "<< lenght * lenght<< " squre_foot"<<endl;
	        break;
	        
	    case 2:
		    float radius;
		    cout<<"\nEnter the Radius of circle (In feet)= ";
	        cin>>radius;
	        cout<<"\nArea of Circle = "<< 3.14 * (radius*radius) << " squre_foot"<<endl;
	        break;
	        
	    case 3:
	    	float base, height;
		    cout<<"\nEnter the Base of Triagle (In feet)= ";
	        cin>>base;
	        cout<<"\nEnter the Height of Triagle (In feet)= ";
	        cin>>height;
	        cout<<"\nArea of Circle = "<< 0.5 * base * height<< " squre_foot"<<endl ;
	        break;
	        
	    case 4:
	    	float leng, wight;
		    cout<<"\nEnter the Lenght of Rectangle (In feet)= ";
	        cin>>leng;
	        cout<<"\nEnter the Wight of Rectangle (In feet)= ";
	        cin>>wight;
	        cout<<"\nArea of Rectangle = "<< leng * wight<< " squre_foot"<<endl ;
	        break;
	        
	    default:
		    cout<<"\nERROR... Invalid input"<<endl;
		    break;
	 } 
	
	return 0;
}

