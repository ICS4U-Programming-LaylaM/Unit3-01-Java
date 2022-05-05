import java.util.*;

/**
* This program creates a stack of strings.
*
* @author Layla Michel
* @version 1.0
* @since 2022-04-25
*/

public class MyStringStack {
    /**
    * Properties.
    */
    private Stack<String> _stack;

    /**
    * Constructor.
    */
    public MyStringStack() {
        _stack = new Stack<String>();
    }

    /**
    * This function adds a number to the top of the stack.
    *
    * @param string as string
    */
    public void push(String string) {
        _stack.push(string);
        System.out.println("Added " + string + " to top of the stack.");
    }

    /**
    * This function removes the string at the top of the stack.
    */
    public void pop() {
        if (_stack.empty()) {
            System.out.println("\nThe stack "
                + "is empty.");
        } else {
            final String topString = _stack.peek();
            _stack.pop();
            System.out.println("\nRemoved " + topString
                 + " from the top of the stack.");
        }
    }

    /**
    * This function finds and displays the string at the top of the stack.
    */
    public void peek() {
        if (_stack.empty()) {
            System.out.println("\nThe stack"
                 + " is empty.");
        } else {
            System.out.println("\nThe string at the top of the stack is: "
                 + _stack.peek());
        }
    }

    /**
    * This function clears the stack of all its strings.
    */
    public void clear() {
        if (_stack.empty()) {
            System.out.println("\nThe stack is "
                + "empty.");
        } else {
            _stack.clear();
            System.out.println("\nThe stack has been cleared.");
        }
    }
}
