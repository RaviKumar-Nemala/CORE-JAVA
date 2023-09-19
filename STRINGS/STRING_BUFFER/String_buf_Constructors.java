

//STARTSWITH AND ENDS WITH IS NOT PROVIDEDIN THE STRING BUFFER    

public class String_buf_Constructors {
     public static void main(String[] args) {
          StringBuffer sb = new StringBuffer("RAVI KUMAR");
          //it is the mutable objects it can allow the change in its data
          //initial capacity(default) of the string buffer is the 16 elements
         // String s = sb.append("HELLO");//string buf cannot conver into string 
         // String s =new String(sb);possible 
          System.out.println(sb.capacity());
          System.out.println(sb.length());
          System.out.println(sb);

          /*StringBuffer sb_check = "fjalfa"; //error 
          String sb_check = "afjaf" //valid
          */




          //second way of creating constructor

          StringBuffer sb1 = new StringBuffer("ABCD");//modifying the initial capacity default capacity is 16 and we can reduce and increase the capacity as per our requirement
          System.out.println(sb1.capacity());//capacity = 4+default capacity = 4+16 = 20
          System.out.println(sb1.length());//4
          System.out.println(sb1);

          //WE WILL LOOK IT LATER DOES NOT HAVE CLARITY
          /*StringBuffer sb2 = new StringBuffer(6);
          sb2.append("HELO0i");
          System.out.println(sb2.capacity());
          System.out.println(sb2);
          */
          

          StringBuffer sb3 = new StringBuffer();
          sb3.ensureCapacity(1);
/**
 * if the specified capacity is lesser then the 16 then defalut capacity is 16 bytes
 * if the specified capacity is between 16 - 34 then default capacity is (16 *2)+2= 34
 *  if the specified is greter then 34 then capacity of the string buffer is our specified capacity 
 */
          
          System.out.println(sb3.capacity());
          sb3.ensureCapacity(22);
          System.out.println(sb3.capacity());
          sb3.ensureCapacity(79);
          System.out.println(sb3.capacity());//returns 79
          sb3.append("DDOS PERFECTION");


          sb3.trimToSize();//returns 79//as per the size it deallocate the remaining memory


          System.out.println(sb3.capacity());//returns 15


          //StringBuffer reverse() returns the Stirn 

          sb3 = new StringBuffer("TARGET 80");
          String _s = sb3.reverse().toString().toLowerCase();
          System.out.println(_s);


          //insert(int index , value ) value may be float 

          sb3 = new StringBuffer("XSS.IS");
          sb3.insert(0,"RUSSIAN ");//returns index outof bound exception if we specify the invalid index
          System.out.println(sb3);

          float f = 11.1f;
          sb3.insert(0,f);//inserting the float value;
          System.out.println(sb3);
          double d = 19;
          System.out.println(sb3.insert(4 , d));
          //all insertions like char[] , float, double , string , string buffer , int , char , all primitive typs we can assing to the insert method
          
          //delete(int start_idx , int from_idx)

          sb3 = new StringBuffer("XSS.IS");
          String _temp =  sb3.delete(0,4 ).toString();//fromt 0th idx to 4-1 = 3 idx elements are deleted reminging elements are transfered to the string 
          System.out.println(_temp);
          sb3.insert(0,"XSS.");
          System.out.println(sb3);
        //  _temp = sb3.delete(0,0); //here no element is going to be deleted
          System.out.println(sb3.deleteCharAt(sb3.indexOf("X")));
          System.out.println(sb3);

          sb3 = new StringBuffer("RUSSIAN XSS.IS");
          //deleteCharAt (int val)  delete one particular char returns the string after the deletion
          _temp = sb3.deleteCharAt(sb3.indexOf("R")).toString();

          _temp=sb3.deleteCharAt(2).toString();//TAKE THE INDEX AS THEARGUMENT
          //if the specified idx is invalid then returns out of bound exception
          System.out.println(_temp);

          //replace (int start idx , int end_idx , string source) returns string buffer

          sb3 = new StringBuffer("RUSSIAN XSS.IS");

          _temp = sb3.replace( 0 , 7 , "ZE ZANA ").toString();// end_idx -1 elements are deleted if  index7 specified it deletes the elements upto the 6th idx only
          System.out.println(_temp);

          _temp= sb3.replace(0,sb3.length()+100 , "SUB ").toString();
          //if the end idx is greater then the string buffer idx then no exception it replace entire starting range to the end with the specified string 
          System.out.println(_temp);

         // _temp = sb3.replace(0, -1 ," HELLO").toString();
          //here is exception end idx is smaller then the start

          //setLength(int val) //used to specify the desired length of the string StringBuffer

          sb3  = new StringBuffer("XSS.IS");
          sb3.setLength(3);//not only 3 elements are presented in the sb3 remaining chars are removed
          System.out.println(sb3);

          sb3.setLength(10);//if the specified size is larger then string buf size remaining size  = specified size - string length no of elements are addeed with the empty spaces
          System.out.println(sb3.length());//3 + 7 = 10

          //sb3.setLength(-1);//returns exception out of  bound
    
          sb3 = new StringBuffer("HELLO YOU CAN'T");
          //void setCharAt(int idx , char ) //used to set a particular character in the specified locatioon
          sb3.setCharAt(0 , 'Y');//returns the exception if the specified idx is not in the range 
          System.out.println(sb3);//removes "H" places "Y"

          
          sb3.replace(0 , 1 , "H");
          System.out.println(sb3);

          sb3.insert(0 , "Y");//does not remove already existed char in the 0th idx 
          System.out.println(sb3);


     }



}
