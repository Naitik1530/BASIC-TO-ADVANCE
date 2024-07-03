//program to find even odd using ternary operator

import java.util.Scanner;

public class EvenOdd1 {
  public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter Your Number ");
    int num=s1.nextInt();
    String result = ( num % 2==0)?"Even" : "odd";
    System.out.println("Number is : "+result);
  }
  
}
