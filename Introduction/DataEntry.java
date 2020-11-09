import java.util.Scanner;
/* 
* Data entry using scanner.
*/
public class DataEntry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /* int number;
        System.out.println("Please enter a number.");

        number = scanner.nextInt();
        System.out.println("The number is: " + number); */

        /* float decimal;
        System.out.println("Please enter a decimal number.");
        decimal = scanner.nextFloat();
        System.out.println("The decimal number is: " + decimal); */

        /* String string;
        System.out.println("Please enter a string.");

        string = scanner.nextLine();
        System.out.println("The string is: "+ string); */

        char letter;
        System.out.println("Please enter a letter.");

        letter = scanner.nextLine().charAt(0);
        System.out.println("The letter is: " + letter);


    }
}
