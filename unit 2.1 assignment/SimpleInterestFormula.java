

import java.util.Scanner;

class SimpleInterestFormula {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    System.out.println("Distance between two points"); // Println leaves a new-line character at the end which makes the next print or println will be on the line under it.
    System.out.println("------------------------------");
    System.out.println("");
    System.out.println("Original amount: ");
    int originalamount = sc.nextInt();
    System.out.println("Number of years: ");
    int years = sc.nextInt();
    System.out.println("Interest rate: ");
    double Interestrate = sc.nextDouble();

    
    
    double Finalamount = originalamount*Math.pow(1+Interestrate,years);
    
    
    System.out.println("Final amount: " + Finalamount);

}
   
    
}