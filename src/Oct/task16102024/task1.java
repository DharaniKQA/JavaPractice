package Oct.task16102024;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name");
        String name= scanner.next();
        System.out.println("Enter the age");
        int age= scanner.nextInt();
        System.out.println("Enter the sal");
        int sal= scanner.nextInt();
        System.out.println("Name is "+name+"\nage is"+age+"\nsal is"+sal);
        scanner.close();
    }
}
