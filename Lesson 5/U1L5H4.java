
import java.util.Scanner;

public class U1L5H4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a distance: ");
        int distance  = s.nextInt();
        System.out.print("Enter a time: ");
        int time  = s.nextInt();
        double speed = distance/time;

        System.out.println(speed);

        s.close();

    }
}
   