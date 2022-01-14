import java.util.Scanner;

/**
 * Created by mohamed on 1/11/2022.
 */
public class ArrayMethod {
  public static int a[] = new int[5];
    public static void input() {
        Scanner in= new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
    }
    public static void print(){
        for (int i = 0; i <a.length ; i++) {
        System.out.println(a[i]);
    }
}

    public static void main(String[] args) {
        input();
        print();
    }
}
