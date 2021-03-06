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
    * User answers yes.
    */
    public static final String YES = "y";

    /**
    * User answers no.
    */
    public static final String NO = "n";

    /**
    * User answers quit.
    */
    public static final String QUIT = "q";

    /**
    * User answers int.
    */
    public static final String INTEGER = "int";

    /**
    * User answers string.
    */
    public static final String STRING = "string";

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
        String userMethod;
        String userAnswer3;
        String userAnswer4;
        String userAnswer5;

        myObj = new Scanner(System.in);

        // Creating objects
        final MyIntStack myStackInt = new MyIntStack();
        final MyStringStack myStackString = new MyStringStack();

        outerloop: while (true) {
            System.out.print("\nDo you wish to use push, pop, "
                + "peek or clear (enter q to quit)? ");
            userMethod = myObj.nextLine();
            userMethod = userMethod.toLowerCase();

            // Push method
            if ("push".equals(userMethod)) {
                midloop: while (true) {
                    System.out.println("\nDo you wish to add to the "
                        + "int or string stack?");
                    System.out.print("Enter either int, string or q "
                        + "to quit: ");
                    userAnswer = myObj.nextLine();
                    userAnswer = userAnswer.toLowerCase();

                    // Quits the program
                    if (QUIT.equals(userAnswer)) {
                        break outerloop;
                    } else if (INTEGER.equals(userAnswer)) {
                        while (true) {
                            System.out.print("\nWhat integer do you wish "
                                + "to add? ");
                            userNum = myObj.nextLine();

                            try {
                                userNumInt = Integer.parseInt(userNum);

                                // Adds integer to stack
                                myStackInt.push(userNumInt);

                                while (true) {
                                    System.out.print("\nDo you wish to"
                                        + " continue? (y/n): ");
                                    userAnswer2 = myObj.nextLine();
                                    userAnswer2 = userAnswer2.toLowerCase();

                                    if (YES.equals(userAnswer2)) {
                                        break;
                                    } else if (NO.equals(userAnswer2)) {
                                        break midloop;
                                    } else {
                                        System.out.println("\nPlease"
                                            + " enter either y or n.");
                                    }
                                }

                            // Error message if the user does not
                            // input an integer
                            } catch (NumberFormatException ex) {
                                    System.out.println("\nPlease enter "
                                        + "a valid number.");
                            }
                        }
                    } else if (STRING.equals(userAnswer)) {
                        while (true) {
                            System.out.print("\nWhat string do you "
                                + "wish to add? ");
                            userString = myObj.nextLine();

                            // Adds string to stack
                            myStackString.push(userString);

                            while (true) {
                                System.out.print("\nDo you wish to "
                                    + "continue? (y/n): ");
                                userAnswer2 = myObj.nextLine();
                                userAnswer2 = userAnswer2.toLowerCase();

                                if (YES.equals(userAnswer2)) {
                                    break;
                                } else if (NO.equals(userAnswer2)) {
                                    break midloop;
                                } else {
                                    System.out.println("\nPlease enter either "
                                        + "y or n.");
                                }
                            }
                        }
                    } else {
                        System.out.println("\nPlease enter"
                            + " either int, string or q.");
                    }
                }

            // Pop method
            } else if ("pop".equals(userMethod)) {
                while (true) {
                    System.out.println("\nDo you wish to remove from the int"
                        + " or string stack?");
                    System.out.print("Enter either int, string "
                         + "or q to quit: ");
                    userAnswer3 = myObj.nextLine();
                    userAnswer3 = userAnswer3.toLowerCase();

                    if (QUIT.equals(userAnswer3)) {
                        break outerloop;
                    } else if (INTEGER.equals(userAnswer3)) {
                        // Removes top number from stack
                        myStackInt.pop();
                        break;
                    } else if (STRING.equals(userAnswer3)) {
                        // Removes top string from stack
                        myStackString.pop();
                        break;
                    } else {
                        System.out.println("\nPlease "
                            + "enter either int, string or q to quit.");
                    }
                }

            // Peek method
            } else if ("peek".equals(userMethod)) {
                while (true) {
                    System.out.println("\nDo you wish to peek the int "
                         + "or string stack?");
                    System.out.print("Enter either int, string or "
                        + "q to quit: ");
                    userAnswer4 = myObj.nextLine();
                    userAnswer4 = userAnswer4.toLowerCase();

                    if (QUIT.equals(userAnswer4)) {
                        break outerloop;
                    } else if (INTEGER.equals(userAnswer4)) {
                        // Displays the number at the top of stack
                        myStackInt.peek();
                        break;
                    } else if (STRING.equals(userAnswer4)) {
                        // Displays the string at the top of stack
                        myStackString.peek();
                        break;
                    } else {
                        System.out.println("\nPlease enter either int, string"
                            + " or q to quit.");
                    }
                }

            // Clear method
            } else if ("clear".equals(userMethod)) {
                while (true) {
                    System.out.println("\nDo you wish to clear the"
                         + " int or string stack?");
                    System.out.print("Enter either int, string or"
                         + " q to quit: ");
                    userAnswer5 = myObj.nextLine();
                    userAnswer5 = userAnswer5.toLowerCase();

                    if (QUIT.equals(userAnswer5)) {
                        break outerloop;
                    } else if (INTEGER.equals(userAnswer5)) {
                        // Clears the int stack
                        myStackInt.clear();
                        break;
                    } else if (STRING.equals(userAnswer5)) {
                        // Clears the string stack
                        myStackString.clear();
                        break;
                    } else {
                        System.out.println("\nPlease enter either int,"
                            + " string or q to quit.");
                    }
                }

            // Quits the program
            } else if (QUIT.equals(userMethod)) {
                break;

            // If the user does not enter a valid input
            } else {
                System.out.println("\nPlease enter either push, pop, peek,"
                    + " clear or q to quit.");
            }
        }
        myObj.close();
    }
}
