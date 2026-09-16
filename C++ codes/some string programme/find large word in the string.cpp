#include<iostream>
#include<cstring>
using namespace std;

void minMaxLengthWords(string str)
{
   int StrLength = str.length();
   int startIndex = 0, endIndex = 0;
   int minLength = StrLength, maxLength = 0, currentLength;
   string smallest, largest;
   while (endIndex <= StrLength){
      if (str[endIndex] != '\0' && str[endIndex] != ' ')
         endIndex++;
      else{
         currentLength = endIndex - startIndex;
         if (currentLength < minLength){
            smallest = str.substr(startIndex, currentLength);
            minLength = currentLength;
         }
         if (currentLength > maxLength){
            largest = str.substr(startIndex, currentLength);
            maxLength = currentLength;
         }
         endIndex++;
         startIndex = endIndex;
      }
   }
   cout<<"\n\nSmallest Word from the string is =  "<<smallest<<"\n";
   cout<<"\n\nSmallest Word from the string is =  "<<largest;
}


int main() {
   cout<< "\tFIND LARGEST WORD IN STRING\n\n\n\n";
	
	string str;
    cout<<"Enter string = ";
    getline(cin, str);
    
    minMaxLengthWords(str);
}
