public class Wrap_2 {
     public static void main(String[] args) {
     
          Integer i  =  Integer.valueOf(2);
          int temp = i;

          int temp_1 = i.intValue();//used to assing the value of object to the normal variable


          Float f = Float.valueOf(11.1f);

          float f_1 = f;
          float f_2 =  f.floatValue();

          System.out.println(temp + " " +temp_1 +" " +f + "  "+f_1 +"  "+f_2);


          String s = "7878";//converting the string to int 
          int it =  Integer.valueOf(s);
          System.out.println(it);


        //  Character ch = new Character('a');


        //INTEGER TO STRING

        int u = 99;
        Integer it_1 = new Integer(u);

        String str = Integer.toString(u);//first way
        str  = Integer.toString(it_1);//second way
          System.out.println(str);

          int r = 10;
          str = ""+r;//simply way to conver int to string 

          Integer r1 = new Integer(11);
          str = ""+r1;//second way


     }     
}
