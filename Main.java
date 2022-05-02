import java.util.Scanner;

/**
* This program creates a stack.
*
* @author Layla Michel
* @version 1.0
* @since 2022-04-25
*/

final class Main {
    /**
    * Default constructor.
    */
    private Main() { }

    /**
    * Creating main function.
    *
    * @param args nothing passed in
    */
    public static void main(String[] args) {
        // Declaring variables
        final Scanner myObj;
        String userAnswer;
        String userAnswer2;
        String userNum;
        int userNumInt;
        String userString;

        myObj = new Scanner(System.in);

        // Creating objects
        final MyIntStack myStackInt = new MyIntStack();
        final MyStringStack myStackString = new MyStringStack();

        outerloop: while (true) {
            System.out.println("Do you wish to add to the int "
                + "or string stack?");
            System.out.print("Enter either int, string or no to quit: ");
            userAnswer = myObj.nextLine();
            userAnswer = userAnswer.toLowerCase();

            if ("no".equals(userAnswer)) {
                break;
            } else if ("int".equals(userAnswer)) {
                while (true) {
                    System.out.print("\nWhat integer do you wish to add? ");
                    userNum = myObj.nextLine();

                    try {
                        userNumInt = Integer.parseInt(userNum);

                        myStackInt.push(userNumInt);

                        while (true) {
                            System.out.print("\nDo you wish to "
                                + "continue? (y/n): ");
                            userAnswer2 = myObj.nextLine();
                            userAnswer2 = userAnswer2.toLowerCase();

                            if ("y".equals(userAnswer2)) {
                                break;
                            } else if ("n".equals(userAnswer2)) {
                                break outerloop;
                            } else {
                                System.out.println("\nPlease enter either "
                                    + "y or n.");
                            }
                        }
                    } catch (NumberFormatException ex) {
                            System.out.println("\nPlease enter "
                                + "a valid number.");
                    }
                }
            } else if ("string".equals(userAnswer)) {
                while (true) {
                    System.out.print("\nWhat string do you wish to add? ");
                    userString = myObj.nextLine();

                    myStackString.push(userString);

                    while (true) {
                        System.out.print("\nDo you wish to continue? (y/n): ");
                        userAnswer2 = myObj.nextLine();
                        userAnswer2 = userAnswer2.toLowerCase();

                        if ("y".equals(userAnswer2)) {
                            break;
                        } else if ("n".equals(userAnswer2)) {
                            break outerloop;
                        } else {
                            System.out.println("\nPlease enter either y or n.");
                        }
                    }
                }
            } else {
                System.out.println("\nPlease enter either int, "
                    + "string or no.\n");
            }
        }
    myObj.close();
    }
}
