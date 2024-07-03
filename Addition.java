//Addition of two number
import java.util.Scanner;

class Addition{
  public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter First Number :  ");
    int number1=s1.nextInt();
    System.out.println("Enter Second Number :  ");
    int number2=s1.nextInt();
    int total=number1+number2;
    System.out.println(" Sum of two Number is :  "+total);
  }
}