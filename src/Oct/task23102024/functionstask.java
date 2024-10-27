package Oct.task23102024;

import java.util.Scanner;

public class functionstask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:");
        int n1= sc.nextInt();
        System.out.println("Enter num2:");
        int n2= sc.nextInt();
        int sum=sum_of_nums(n1,n2);
        System.out.println("sum is "+sum);
        int sub=subtraction_of_nums(n1,n2);
        System.out.println("sub is "+sub);
        int mul=multiplication_of_nums(n1,n2);
        System.out.println("mul is "+mul);
        int div=division_of_nums(n1,n2);
        System.out.println("div is "+div);
    }
    static int sum_of_nums(int a, int b)
    {
        return a+b;
    }
    static int subtraction_of_nums(int a, int b)
    {
        return a-b;
    }

    static int multiplication_of_nums(int a, int b)
    {
        return a*b;
    }

    static int division_of_nums(int a, int b)
    {
        return a/b;
    }

}
