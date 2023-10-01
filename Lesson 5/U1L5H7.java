import java.util.Scanner;

public class U1L5H7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height  = s.nextInt();
        System.out.print("Enter weight: ");
        int weight  = s.nextInt();
        double BMI = weight / (height * height); 

        System.out.println(BMI);

        s.close();
    }

}
