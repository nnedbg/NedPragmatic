
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A ");
        double numberA = sc.nextDouble();
        System.out.println(" Enter B ");
        double numberB = sc.nextDouble();
        System.out.println(" Enter C ");
        double numberC = sc.nextDouble();


        if (numberC > numberA && numberC < numberB){
            System.out.println("The number " +  numberC + " is between " + numberA + " and B " + numberB);
        } else {
            System.out.println("The number " +  numberC + " is not between " + numberA + " and " + numberB);
        }

    }

}
