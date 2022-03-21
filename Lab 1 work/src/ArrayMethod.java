import java.util.Scanner;

/**
 * Created by Ahmed on 1/10/2022.
 */
public class ArrayMethod {
  public static int a[] = new int[5];
    public static void input() {
        Scanner input= new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
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
