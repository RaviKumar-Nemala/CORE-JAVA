class A
{
     int i , j ;
     A()
     {
          this.i =10;
          this.j=20;
     }

     public boolean equals(A obj)
     {
      return true;    
     }
}

public class equals_method {
     public static void main(String[] args) throws Exception{
          //equals() METHOD IS USED TO CHECK THE TWO OBJECTS ARE 
          //HAVING THE SAME DATA  OR NOT
          //== is used to check that two operands are equal or not
//it means if that two operands are primitive variables then it check 
//those primitive variables are having same data or not
//if two operands are the object_Ref_varaibles then it will check 
//those object ref_variables are having the same object reference value or NOT

          int i =1;
          int j =1;
          if(i ==  j )
          {
               System.out.println("same");
          }
          A obj1= new A();
          A obj2 = new A();
          if(obj1 == obj2)
          {              
           System.out.println("same");
               
          }
          if(obj1.equals(obj2))
          {
               System.out.println("OBJECT DATA IS SAME");
          }

          /*equals method is presented  in the object class
defalulty it is overridden in the string class in such a way that it 
check the data on the two objects */
//it will perform case sentive comparision//
          String s = new String("hello");
          String s2 = new String("hello");
          if(s.equals(s2))
          {
               System.out.println("true");
          }


     String temp ="RAVI";
     String temp_2="ravi";

     /*equalsIgnoreCase method is used to perform comparision between
strings irrespective of the casesensitive*/

      boolean result = temp.equalsIgnoreCase(temp_2);
      System.out.println(result);



      /*CompareTo method is used to compare the two strings as per the 
      dictionary order
     it returns the +value if the second string dictionary order is first   then the first string 
     it returns the -value if the first string dicitonary order is first then the second string
     it returns 0 if the twol strings have the same dictionary order*/

     temp = "def";
     temp_2 ="abc";
     System.out.println(temp.compareTo(temp_2));//second string dictionary orde is first then first so it returns +ve value 

     
     temp="abc";
     temp_2="def";
     System.out.println(temp.compareTo(temp_2));

     temp= "ABC";
     temp_2="abc";
     //in dictionary order ABC will come first
     //when compare with the abc
     //so it return -ve value because of the first string is first in the dictionary order
     System.out.println(temp.compareTo(temp_2));


     /*compareToIgnoreCase() method is used to compare strings based on 
     the dictionary method irrespective of the case*/

     temp ="ABC";
     temp_2="abc";
     System.out.println(temp.compareToIgnoreCase(temp_2));//return 0 because both are same due to case sensitivity ignored



     /* startsWith() method ->if string starts with provided string or NOT
     */
     
     String check ="Computer";
     if(check.startsWith("com"))
     {
          System.out.println("dfljal");
     }
     if(check.startsWith(""))//it is also return true
     {
          System.out.println("dfljal");
     }
     

     check = "ComputerWORLD";

     if(check.endsWith("LD"))
     {
      System.out.println("ending is same");    
     }
     if(check.endsWith("lfaljf"))
     {
          System.out.println("ending is not same");
     }


     check ="ComputerWORLD";

     if(check.contains("ter"))//if not returns false
     {
          System.out.println("contained the sub string");
     }


     check ="Ravi Kumar";
     System.out.println(check.charAt(0));
     System.out.println(check.charAt(3));

     //System.out.println(check.charAt(59));//exception here indexOutOfBoundException

     char ch_1 = check.charAt(0);
     System.out.println(ch_1);


//replace () method is used to replace the chars or the strings in the given string 
//it returns the string as the return type//
     String rep_test = new String("House Owner");
    // String test = check.replace("OWner","Servent");
     //System.out.println(check  +" "+test);
     System.out.println(rep_test.replace("House","s"));
     String test =  new String();
     rep_test =  rep_test.replace("House", "Big House");
      System.out.println(rep_test);
      test = rep_test.replace("House", "Big House");
     System.out.println(test);

     rep_test="House Owner House";
     //if you want to replace only first string house then use this
     rep_test = rep_test.replaceFirst("House","MY HOUSE");//onlyfirst string house will be replaced
     System.out.println(rep_test);
     rep_test=  rep_test.replaceAll("House", "MY HOUSE");
     //defalutly it replace method will replace all strings as provided 


     rep_test ="HELLO WORLD";
     
     System.out.println(rep_test.indexOf("h"));//returns -1 if the given char not found
     //returns the index of that char or the weather the provide source is string 
//it returns the first index of the string //

     System.out.println(rep_test.indexOf("HELLO"));
     System.out.println(rep_test.indexOf("WORLD"));

     //indexOf(source ,  fromindex value);

     System.out.println(rep_test.indexOf("O" , 4));//check for O from the 4th index
     System.out.println(rep_test.indexOf("O" , 7));



     //lastIndex("string") returns integer(index value)
     //it returns -1 if it does not exist
     String freud = "Sigmund Freud Psycho Freud";

     System.out.println(freud.lastIndexOf("F"));
     System.out.println(freud.lastIndexOf("Freud"));

     //lastIndex("string" , int toValue) returns integer(index value)
     //int res = freud.lastIndexOf("Freud" , 19);
     //check for the last occurance of the string  upto the specified index

     System.out.println(freud.lastIndexOf("Freud" ,19 ));
     //here 19 specifed it checks the last occurance of Freud form index -0 to 19 index

     

     //substring(int from_index) //returns string
     //throws exception if the specified index is out of range
     freud = "Sigmund Freud Psycho Freud";

     String sub_str = freud.substring(8);
     System.out.println(sub_str);

     //substring(int from_index , int to_index);
     //in this context to_index is not considered so add +1 if you 
     //want to include the to index char also
     sub_str = freud.substring(3 ,26);
     System.out.println(sub_str);


     /*split(string delimeter) //takes the delimeter in the form of the
     string and returns the String [].
     */

     freud = "Sigmund Freud Psycho Freud";

     String split_arr[] =  freud.split(" "); //devide the string based on the space and store those sub strings in the string array
     for( String split_temp:split_arr)
     {
          System.out.println(split_temp);
     }

     /*split(string delimeter , int no_of_attemps)
* no_of_attempts parameter  used to specify the no of times that string has to be 
seperated based on the given delimeter*/

     freud = "Sigmund Freud Psycho Freud";

     split_arr =  freud.split(" ",2);
          //here it splits the string based on the space on the no_of_Attmepts-1 times
          //this measn first piece we get as Sigmunde remaing we get as another string

     for( String split_temp:split_arr)
     {
          System.out.println(split_temp);
     }
     split_arr =  freud.split(" ",1);
     //0 times split has continued so same string will be presented

     split_arr =  freud.split(" ",-1);
     //here split performed as long as the spaces are occurs means
     //jvm will returns strings based on the spaces on the original string 


     //String.getBytes() returns the byte[] 
     //used to convert the string(characters in the string )  into the byte form(integer) 

     freud = "Sigmund Freud Psycho *Freud";
     byte bytes[] ;
     bytes=freud.getBytes();

     for(byte _b : bytes)
     {
          System.out.println(_b);
     }
     /*converting the bytes again into the string buffer
     StringBuffer sb = new StringBuffer();
     for(byte _b : bytes)
     {
          sb.append((char)_b);
     }
     System.out.println(sb);
     */

     //string.getBytes(string char_set)

     freud = "Sigmund Freud Psycho";
     
     bytes = freud.getBytes("ISO-8859-1"); //UTF -8 IS ONE OF THE CHAR SET TO STORE THE STRING ;

     for(byte _b : bytes)
     {
          System.out.println(_b);
     }


     //CharArray() return the char[] used to conver the string into the char array type
     
     char temp_ch[] = freud.toCharArray();
     for(var  _temp : temp_ch)
     {
          System.out.println(_temp);
     }



     //trim() returns the string
     //used to delete the before and the after spaces in the string
     freud = "        Sigmund Freud Psycho Freud         ";
     String res_str = freud.trim();//it removes all the before and the after spaces in the string 
     System.out.println(res_str);//it does not remove the in  spaces between the words
     System.out.println(res_str);//it does not remove the in  spaces between the words



     //toLower() used to convert the string or the char into the lower case

     freud = "Sigmund Freud Psycho Freud ";
     System.out.print(freud.toLowerCase());
     System.out.println(freud.toUpperCase());


     char  y ='A';
     String _Str = ""+y;
   //  System.out.println(_Str.toLowerCase());
     //Integer integer = Integer.valueOf((int)_Str);
     //System.out.print(integer);
     //char x =  re.toLowerCase().charAt(0);
   //  System.out.println(x);


   _Str = "X";//convert string to char ;
   y = _Str.charAt(0);
   //Character chr = Character.valueOf(_Str);
   //y =  chr;
   System.out.println(y);


   //intern() method i
   /*intern () method used to send the string data from the heap memory to the string constant pool area if the data is not existed in the string constant pool area

if it existed it simply returns that obj ref _Val*/

     String s1 = new String("Earth");
     String s3 =s1.intern();//points to the string constant pool area
     String s4 = s1.intern();//same object ref assigned to this s4
     if(s3 == s4)
     {
          System.out.println("both are same obj_ref");
     }
     if(s1 == s3) //it returns false because of s1 have the heap obj_ref and s3 have the string pool const area obj ref
     {

     }




}
}

