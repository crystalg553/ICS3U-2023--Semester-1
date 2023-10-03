import java.util.Scanner;

public class BVGpool {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter the length of the pool: ");
        int length  = s.nextInt();
        System.out.print("Please enter the weidth of the pool: ");
        int width  = s.nextInt();
        System.out.print("Please enter the depth of the shallow end: ");
        int depthShallow  = s.nextInt();
        System.out.print("Please enter the depth of the deep end: ");
        int depthDeep  = s.nextInt();
        System.out.print("Please enter the transition between shallow and deep end: ");
        int transition  = s.nextInt();
        System.out.print("Please enter the length of the shallow end: ");
        int lengthShallow  = s.nextInt();
        System.out.print("Please enter the price per meter square of the liner: ");
        int linerPrice  = s.nextInt();


        double lengthTransitione = Math.sqrt(transition^2 + (depthDeep - depthShallow)^2); 

        double volumeDeep = depthDeep * width * (length - lengthShallow- lengthTransitionee); 

        double volumeShallow = depthShallow * width * lengthShallow; 

        double volumeTranstion = depthDeep * width * lengthTransitionee - (1/2 * (depthDeep - depthShallow) * width); 

        double totalVolume = volumeDeep + volumeShallow + volumeTranstion; 

        System.out.println(totalVolume); 

        double surfaceAreaDeep = 3*(depthDeep *(length - lengthShallow - lengthTransitionee)) + depthDeep * width; }

        double surfaceAreaShallow = depthShallow * lengthShallow * width; 

        double surfaceAreaTransition = lengthTransitionee * width + 2 * depthShallow * lengthTransitionee + (depthDeep - depthShallow)*lengthTransitionee; 

        double totalSurfaceArea = surfaceAreaDeep + surfaceAreaShallow + surfaceAreaTransition; 

        System.out.println(totalSurfaceArea);



    }
}

        
