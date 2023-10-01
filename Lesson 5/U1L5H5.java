import java.util.Scanner;

public class U1L5H5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a price: ");
        int originalPrice  = s.nextInt();

        double newPrice = 1.13*(0.8*originalPrice);

        System.out.println(newPrice);

        s.close();
    
}
}
