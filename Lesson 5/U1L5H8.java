import java.util.Scanner;

public class U1L5H8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1  = s.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = s.nextInt();
        double ans = ((num1 + 5) * 3) % (int)(num2 / 2);

        System.out.println(ans);

        s.close();
    
}
}
