
import java.util.Scanner;

class DistFormula {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    System.out.println("Distance between two points"); // Println leaves a new-line character at the end which makes the next print or println will be on the line under it.
    System.out.println("------------------------------");
    System.out.println("");
    System.out.println("x1: ");
    int x1 = sc.nextInt();
    System.out.println("y1: ");
    int y1 = sc.nextInt();
    System.out.println("x2: ");
    int x2 = sc.nextInt();
    System.out.println("y2: ");
    int y2 = sc.nextInt();
    
    
    double Distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    
    
    System.out.println("Distance: " + Distance);

}
   
    
}
