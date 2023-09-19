package INTRODUCTION;

class Sb
{
     static int i ;
     int j ;
     
     void normal_method()
     {
          System.out.println("jadl jas la");
     }
     static//static block
     {
          System.out.println(i);
          //normal_method();//cannot access the normal methods from the static block
        //  int j = this.j;//cannot possible to use the this keyword in the static block and also static method

     }    
}


public class Static_Blocks {
     
}
