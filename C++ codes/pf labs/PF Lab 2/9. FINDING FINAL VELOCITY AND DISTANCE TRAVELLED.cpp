#include <iostream>
using namespace std;

int main ()
{
	cout << "\t FINDING FINAL VELOCITY AND DISTANCE TRAVELLED \n\n\n\n";
	
	float initial_velocity, accelaration, time,  distance_travel, final_velocity;
	
    cout << "Enter initial velocity of the object = ";
    cin >> initial_velocity;
    
    cout << "\nEnter accelaration of the object = ";
    cin >> accelaration;
    
    cout << "\nEnter the time that has elapsed = ";
    cin >> time;
    
    final_velocity = initial_velocity + (accelaration * time);
    distance_travel = (initial_velocity * time) + 1/2 * (accelaration * (time*time));
    
    cout << "\n\nFinal velocity of the object = "<< final_velocity<<"\n\nDistance travelled by object = "<<distance_travel<< endl;
    

	return 0;
}

