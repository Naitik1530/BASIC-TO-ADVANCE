//program to check number is positive or negative

import java.util.Scanner;

public class Positive {
  public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    double number=13.2;
    if (number>0.0){
      System.out.println("The Number is positive : "+number);
    }
    else if (number<0.0) {
      System.out.println("The Number is Negative : "+number);
      
    }
    else{
      System.out.println("The Number is zero");
    }
  }
  
}
