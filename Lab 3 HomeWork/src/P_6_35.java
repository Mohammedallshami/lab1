import java.util.Scanner;

/**
 * Created by Ahmed on 2/10/2022.
 */
public class P_6_35 {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String postfix = "87+573-*+";
        System.out.println("Enter the PostFix Expression ");
        postfix =scanner.next();
        System.out.print("The PostFix Evaluation for the Given Expression "+ postfix +" = " + evaluatePostfix(postfix));
    }


    //Methods
    static boolean isOperator(char operator)
    {
        if(operator == '*' || operator == '/' || operator == '+' || operator == '-')
            return true;

        return false;
    }

    static int evaluatePostfix(String postfix)
    {
        ArrayStack<Integer> postFix = new ArrayStack<>();
        int n = postfix.length();

        for(int i=0;i<n;i++)
        {
            if(isOperator(postfix.charAt(i)))
            {
                int op1 = postFix.pop();
                int op2 = postFix.pop();

                switch(postfix.charAt(i))
                {
                    case '+': postFix.push(op2 + op1);break;
                    case '-': postFix.push(op2 - op1);break;
                    case '*': postFix.push(op2 * op1);break;
                    case '/': postFix.push(op2 / op1);break;
                }

            }
            else
            {
                int operand = postfix.charAt(i) - '0';
                postFix.push(operand);
            }
        }

        return postFix.pop();
    }
}

