import java.util.Scanner;

/**
 * Created by Ahmed on 1/10/2022.
 */
public class InputArrays {
    public static void main(String[] args) {
        int a []= new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
