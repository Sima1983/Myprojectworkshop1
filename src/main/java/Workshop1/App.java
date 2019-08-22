package Workshop1;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scanner =new Scanner(System.in);
    public static void main( String[] args )
    {
        int secretNumber = 10;
        int maxGusses = 5;
        boolean keepAlive =true;
        while(keepAlive){
            System.out.println( "Hello World!" );
            System.out.println("1.play the game");
            System.out.println("2.Quit");
            System.out.println("Please make a choice: ");//print
            String choice = scanner.nextLine();
            if(choice.equals(1)) {
                String outcome= playGame( secretNumber, maxGusses);
                System.out.println(outcome);
            }
            else if(choice.equals(2)){
                    keepAlive = false;
                }
                else{
                    System.out.println("unrecognized input");
    }
}


}
    private static String playGame(int secretNumber,int maxGuesses) {
        String outcome = "You lose";
        for (int guessNumber = 1; guessNumber <= maxGuesses; guessNumber++) {
            System.out.println("Guess" + guessNumber + "of" + maxGuesses);
            String numberInput = scanner.nextLine();
        }





       /* public class JavaExample {

        public static void main(String[] args) {

                double num1, num2;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter first number:");

                /* We are using data type double so that user
                 * can enter integer as well as floating point
                 * value
                 */
  /*              num1 = scanner.nextDouble();
                System.out.print("Enter second number:");
                num2 = scanner.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                scanner.close();
                double output;

                switch(operator)
                {
                    case '+':
                        output = num1 + num2;
                        break;

                    case '-':
                        output = num1 - num2;
                        break;

                    case '*':
                        output = num1 * num2;
                        break;

                    case '/':
                        output = num1 / num2;
                        break;

                    /* If user enters any other operator or char apart from
                     * +, -, * and /, then display an error message to user
                     *
                     */
    /*                default:
                        System.out.printf("You have entered wrong operator");
                        return;
                }

                System.out.println(num1+" "+operator+" "+num2+": "+output);
      */

       // Output:

       // Enter first number:40
        //Enter second number:4
       // Enter an operator (+, -, *, /): /
      //  40.0 / 4.0: 10.0