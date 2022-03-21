import java.util.Scanner;

/**
 * Created by Ahmed on 2/10/2022.
 */
public class R_6_5 {
    public static ArrayStack removing(ArrayStack s)
    {
        while (s.isEmpty()!=true)
        {
            s.pop();
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayStack<String> s=new ArrayStack<>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element: ");
            s.push(scanner.next());
        }
        System.out.println("Is it empty before removing ?  "+s.isEmpty());
        s=removing(s);
        System.out.println("Is it empty after removing ?  "+s.isEmpty());

    }
}