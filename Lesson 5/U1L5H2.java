import java.util.Scanner;

public class U1L5H2 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int usDollars  = input.nextInt();

    double canadianDollars = (usDollars * 1.25); 
    System.out.println(canadianDollars); 
    input.close();
    } 
}
    
