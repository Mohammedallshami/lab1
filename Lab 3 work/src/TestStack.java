import java.util.Scanner;

/**
 * Created by Ahmed on 1/24/2022.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack=new ArrayStack<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("Is the Stack empty? " + myStack.isEmpty());
        System.out.println("Enter elements");

        for (int i = 0; i <5; i++) {
            myStack.push(in.nextInt());
            System.out.println("Top element= " +myStack.top());
            System.out.println("Size= "+myStack.size());
            System.out.println("Is the Stack empty? " + myStack.isEmpty());

        }


        for (int i = 0; i <6 ; i++) {
            myStack.pop();
            System.out.println("Deleted element= " +myStack.pop());
            System.out.println("Top element after delete= " +myStack.top());
            System.out.println("Size= "+myStack.size());
            System.out.println("Is the Stack empty? " + myStack.isEmpty());

        }
    }
}
