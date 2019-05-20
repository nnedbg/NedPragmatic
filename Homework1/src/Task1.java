
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A ");
        int numberA = sc.nextInt();
        System.out.println(" Enter B ");
        int numberB = sc.nextInt();
        System.out.println(" Enter C ");
        int numberC = sc.nextInt();


        if (numberC > numberA && numberC < numberB){
            System.out.println("The number " +  numberC + " is between " + numberA + " and B " + numberB);
        } else {
            System.out.println("The number " +  numberC + " is not between " + numberA + " and " + numberB);
        }

    }

}
