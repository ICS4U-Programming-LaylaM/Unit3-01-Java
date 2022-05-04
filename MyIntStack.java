import java.util.*;

/**
* This program creates a stack of integers.
*
* @author Layla Michel
* @version 1.0
* @since 2022-04-25
*/

public class MyIntStack {
    /**
    * Properties.
    */
    private Stack<Integer> _stack;

    /**
    * Constructor.
    */
    public MyIntStack() {
        _stack = new Stack<Integer>();
    }

    /**
    * This function adds a number to the top of the stack.
    *
    * @param number as int
    */
    public void push(int number) {
        _stack.push(number);
        System.out.println("Added " + number + " to top of the stack.");
    }

    /**
    * This function removes the number at the top of the stack.
    */
    public void pop() {
        if (_stack.empty()) {
            System.out.println("\nThe stack is empty.");
        } else {
            final int topNum = _stack.peek();
            _stack.pop();
            System.out.println("\nRemoved " + topNum
                 + " from the top of the stack.");
        }
    }
}
