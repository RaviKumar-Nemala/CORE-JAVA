package INTRODUCTION;
class Addition{

      Addition() //IF WE PROVIDE THE CONSTRUCTOR AS THE PRIVATE WE CANT' ACCESS THE CONSTRUCTOR FROM THE OUT SIDE WE MUST PROVIDE THE METHOD IN PUBLIC TO ACCESS THE CLASS
     {
          System.out.println("DEFAULT CONSTRUCTOR");
     }
     Addition(int a , int b )
     {
          System.out.println("TWO PARAMETERS ");
     }

     Addition(int a , int b   ,int c)
     {
          System.out.println("THREE PARAMETERS ");

     }
}



class Test{


     public static void main(String args[])
     {
         // Addition add = new Addition();
          //Addition a2 = new Addition(1,2);
          //Addition a3 =  new Addition(1,2,3);

     }

}
