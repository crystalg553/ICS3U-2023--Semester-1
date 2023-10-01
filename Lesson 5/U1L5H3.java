import java.util.Scanner;

public class U1L5H3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int radius  = s.nextInt();


        double area = radius*radius * Math.PI; 
        double circumference = radius * 2 * Math.PI; 

        System.out.println(area + "and" + circumference); 
        s.close();

    }
   
}
