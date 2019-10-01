
import java.util.Scanner;

class D6 {

    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
    System.out.println("10 random 6 sided dice!"); // Println leaves a new-line character at the end which makes the next print or println will be on the line under it.
    System.out.println("------------------------------");
    System.out.println("");
    
double dice1 = (Math.random()*((6 - 1) + 1 )) + 1;   
double dice2 = (Math.random()*((6 - 1) + 1 )) + 1;
double dice3 = (Math.random()*((6 - 1) + 1 )) + 1;
double dice4 = (Math.random()*((6 - 1) + 1 )) + 1;
double dice5 = (Math.random()*((6 - 1) + 1 )) + 1;
double dice6 = (Math.random()*((6 - 1) + 1 )) + 1;
double dice7 = (Math.random()*((6 - 1) + 1 )) + 1;
double dice8 = (Math.random()*((6 - 1) + 1 )) + 1;
double dice9 = (Math.random()*((6 - 1) + 1 )) + 1;
double dice10 = (Math.random()*((6 - 1) + 1 )) + 1;


int d1 = (int) dice1;
int d2 = (int) dice2;
int d3 = (int) dice3;
int d4 = (int) dice4;
int d5 = (int) dice5;
int d6 = (int) dice6;
int d7 = (int) dice7;
int d8 = (int) dice8;
int d9 = (int) dice9;
int d10 = (int) dice10;

    
System.out.println("Dice1  : " + d1);
System.out.println("Dice2  : " + d2);
System.out.println("Dice3  : " + d3);
System.out.println("Dice4  : " + d4);
System.out.println("Dice5  : " + d5);
System.out.println("Dice6  : " + d6);
System.out.println("Dice7  : " + d7);
System.out.println("Dice8  : " + d8);
System.out.println("Dice9  : " + d9);
System.out.println("Dice10 : " + d10);
    

}
   
    
}
