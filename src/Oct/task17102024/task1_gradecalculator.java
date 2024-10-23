package Oct.task17102024;

import java.util.Scanner;

public class task1_gradecalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();
        char grade;
        if (score >= 90 && score <= 100) {
            grade='A';
        } else if (score >= 80 && score <= 89) {
            grade='B';
        } else if (score >= 70 && score <= 79) {
            grade='C';
        } else if (score >= 60 && score <= 69) {
            grade='D';
        } else if(score<=0 || score>100) {
            grade = 'o';
        }
        else{
            grade='F';
        }
        System.out.println("grade is "+grade);
        sc.close();
    }
}
