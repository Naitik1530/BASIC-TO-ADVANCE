//program to check even odd using if else

import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter your Number : ");
    int num=s1.nextInt();
    if (num%2==0) {
      System.out.println("Number is even : "+num);
}
else{
  System.out.println("Number is Odd : "+num);
}
  }
  
}
