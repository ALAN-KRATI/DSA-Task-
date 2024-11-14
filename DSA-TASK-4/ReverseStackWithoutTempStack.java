import java.util.*;
public class TBPPP {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }

    private static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, item);
        stack.push(temp);
    }

    public static void print(Stack<Integer> stack){
        while(!stack.isEmpty()) System.out.println(stack.pop());
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        reverseStack(stack);
        print(stack);
    }
}