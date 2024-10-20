package Oct.task15102024;

public class Lab1510 {
    public static void main(String[] args) {
      int a=9,b=15,c=16,d=10;
      int max1=(b>c)?(b>d?b:d):(c>d?c:d);
      int max=(a>max1)?a:max1;
      System.out.println(max);

    }
}
