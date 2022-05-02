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
    * This functions adds a number to the top of the stack.
    *
    * @param string as string
    */
    public void push(String string) {
        _stack.push(string);
        System.out.println("Added " + string + " to top of the stack.");
    }
}
