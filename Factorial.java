//factorial of a Number using while loop
public class Factorial {
  public static void main(String[] args) {
    int num=4;
    int output=1;
    for(int i=1;i<=num; i++){
      //System.out.println(i);this will show 1,2,3,4
      output=output*i;//output will multiply by 1
    }
    System.out.println("Factorial of given number is :  "+output);
  }
  
}
