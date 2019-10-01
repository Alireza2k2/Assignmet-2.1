
import java.util.Scanner;

class Example1 {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    System.out.println("Radius To Area"); // Println leaves a new-line character at the end which makes the next print or println will be on the line under it.
    System.out.println("------------------------------");
    System.out.println("");
    System.out.println("Radius: ");
    int r = sc.nextInt();
    Double r2 = Math.pow(r,2);
    
    
    Double Area = r2*Math.PI;
    
    
    System.out.println("Area: " + Area);

}
    
}
