import java.util.Scanner;

/**
 * Created by Ahmed on 1/10/2022.
 */
public class R_6_4 {

    public static ArrayStack transfer(ArrayStack s,ArrayStack t)
    {
        while (s.isEmpty()!=true)
        {
            t.push(s.pop());
        }
        return t;
    }
    public static void main(String[] args) {
        ArrayStack<String> S =new ArrayStack<>(5);
        ArrayStack<String> T =new ArrayStack<>(5);
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element: ");
            S.push(scanner.next());
            System.out.println("S Top = "+S.top());
        }
        System.out.println();
        T=transfer(S,T);
        for (int i = 0; i < 5; i++) {
            System.out.print("T Top = "+T.top());
            T.pop();
            System.out.println( );

        }

    }
}
