import java.util.Scanner;

public class U1L5H10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter totalMinutes: ");
        int min  = s.nextInt();
        double hr = (min/60);

        System.out.println(hr);

        s.close();
    }
}
