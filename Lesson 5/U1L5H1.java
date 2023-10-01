import java.util.Scanner; 

public class U1L5H1{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int fahrenheit  = input.nextInt();

    double celsius = (fahrenheit - 32) * 5 / 9; 

    System.out.println(celsius); 

    input.close();
    }

}


