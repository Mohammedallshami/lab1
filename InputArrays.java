import java.util.Scanner;

/**
 * Created by mohamed on 1/11/2022.
 */
public class InArrays {
    public static void main(String[] args) {
        int a []= new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
