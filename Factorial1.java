//factorial of a number using while loop
public class Factorial1 {
  public static void main(String[] args) {
    int num=4;
    int i=1;
    int output=1;
    
    while (i<=num) {
      //System.out.println(i);
      output=output*i;
      i++;

      
    }
    System.out.println("The Factorial of given Number is : "+output);
  }
  
}
