class Check_1
{

     public   String  toString()
     {
          System.out.println("OVER RIDEN TO STRING METHOD HAS CALLED : ");
          return "";
     
     }


     public int hashCode()
     {
          System.out.println("OVER RIDEN HASH CODE METHOD HAS CALLED");
          return 1;
     }

}
public class Hash_Code_Ref_Val {
     public static void main(String Args[])
     {
          Hash_Code_Ref_Val obj = new Hash_Code_Ref_Val();
          int hash_code = obj.hashCode();//this hash code value we got from the OBJECT class becaz there is no method toString() is available in this particular class
          String ref_val = obj.toString();
          System.out.println("HASH CODE : " +hash_code  +"\n REFERENCE VALUE : " +ref_val);  


          Check_1 user_obj  = new Check_1();
          System.out.println(user_obj); //internally jvm will call user_obj.toString()method if we specify only the reference variable//
          System.out.println(user_obj.toString());//here insted of calling the to string method in the java.lang. Object class it will  first check weather this method exists on this Check class if it is then will execute that properties only
          System.out.println(user_obj.hashCode());   
          
          
          String str = new String("HELLO");
          //here insted of executing the OBJECT class refernce value we get the content of the strins as HELLO this is because String class toString method has executed//
          System.out.println(str);

          //Integer f =  new Integer(22);
          //System.out.println(f);//insted of executing to string method we get the integer value becaz of the Integer class to string has executed
     }
}
