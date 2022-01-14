import java.util.Scanner;

/**
 * Created by mohamed on 1/11/2022.
 */
public class Management {
    public static void main(String[] args) {

        /*Student [] team = new Student[3];

        /Student s1 = new Student(1,"mohamed");
        team[0]=s1;

        Student s2 = new Student(2,"ali");
        team[1]=s2;

        Student s3 = new Student(3,"ahmed");
        team[2]=s3;*/

        for (int i = 0; i <team.length; i++) {
            Scanner input = new Scanner(System.in);
            Student s1 = new Student(input.nextInt() , input.next());
            team[i]=s1;
        }

        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }
    }
}
