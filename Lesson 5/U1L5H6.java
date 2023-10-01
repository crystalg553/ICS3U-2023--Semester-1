import java.util.Scanner;

public class U1L5H6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter side number 1: ");
        int side1  = s.nextInt();
        System.out.print("Enter side number 2: ");
        int side2 = s.nextInt();
        double side3 = Math.sqrt((side1)^2 + (side2)^2);

        System.out.println(side3);

        s.close();
    
}
}
