package Oct.task18102024;

import java.util.Scanner;

public class task1_simplecalc_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");
        int num2=sc.nextInt();
        System.out.println("Enter operator");
        String op=sc.next();
        int result;
        switch(op){
            case "+":
                result=num1+num2;
                System.out.println("num1+num2-> "+result);
                break;
            case "-":
                result=num1-num2;
                System.out.println("num1-num2-> "+result);
                break;
            case "*":
                result=num1*num2;
                System.out.println("num1*num2-> "+result);
                break;
            case "/":
                result=num1/num2;
                System.out.println("num1/num2-> "+result);
                break;
            case "%":
                result=num1%num2;
                System.out.println("num1%num2-> "+result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
