

public class Wrap_1 {
public static void main(String[] args) {
     int i = 1;
     //Integer in = new Integer(i);//first way it is deprecated way
     Integer temp_1 = i; // auto boxing//second way
    // Integer temp_2 = Integer.valueOf(i);//third way
     
     //Float f = new Float(22.2f);
     float t = 4.5f;
     Float f_1 = t;
     Float f_2 = Float.valueOf(f_1);
     
     System.out.println(  "  " + temp_1 +" "+f_2  + " " + i + " " );
}     
}
