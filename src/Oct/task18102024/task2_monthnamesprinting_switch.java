package Oct.task18102024;

import java.util.Scanner;

public class task2_monthnamesprinting_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of the month");
        int num = sc.nextInt();
        String monthname;
        switch (num) {
            case 1:
                monthname = "Jan";
                break;
            case 2:
                monthname = "Feb";
                break;
            case 3:
                monthname = "Mar";
                break;
            case 4:
                monthname = "Apr";
                break;
            case 5:
                monthname = "May";
                break;
            case 6:
                monthname = "Jun";
                break;
            case 7:
                monthname = "Jul";
                break;
            case 8:
                monthname = "Aug";
                break;
            case 9:
                monthname = "Sept";
                break;
            case 10:
                monthname = "Oct";
                break;
            case 11:
                monthname = "Nov";
                break;
            case 12:
                monthname = "Dec";
                break;
            default:
                monthname = "Invalid month";
                break;

        }
        System.out.println(monthname);
        sc.close();
    }
}
