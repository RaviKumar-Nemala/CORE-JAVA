#include<iostream>
using namespace std;
#define print cout<<
#define line <<endl;

int main()
{
     int i , j; 
     int target ;
     int n;
     print "ENTER THE RANGE OF THE PRIME NUMBERS " line 
     cin>>n;
     

     print "ENTER THE PRIME NUMBER POSITION : " line
     cin>>target;
     int count =  0;

     for ( int first = 1;first <= n ; first++ )
     {

          for ( j  = 1 ;j  <=first  ; j ++ )
          {
               if(first%j==0)
               {
                    count++;
               }
          }
          if(count == 2)
          {
               if(target == 1 ){
               print first line 
               break;
               }
          target --;
              
          }
          count = 0;
     }
     return 0;
}