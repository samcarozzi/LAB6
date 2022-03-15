import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //to create initial vars
        System.out.print("Enter first operand: ");
        double first = in.nextDouble();
        System.out.println("Enter second operand: ");
        double second = in.nextDouble();
        System.out.println(" Calculator Menu \n --------------- \n" +
                "1. Addition \n" +
                "2. Subtraction \n");
        System.out.println("Which operation do you want to perform?");

        int selection = in.nextInt();
        double result;
        //menu with items to select
        if(selection == 1){
            result = first + second;
            System.out.println("The result of the operation is " + result + ". Goodbye!");
        }
        else if(selection == 2){
            result = first - second;
            System.out.println("The result of the operation is " + result + ". Goodbye!");
        }
    }
}
