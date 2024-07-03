//program to find largest among three number using nested if else statement
public class Largest1 {
  public static void main(String[] args) {
    int a=220,b=56,c=30;
    if (a>b) 
    {
      if (a>c) {
        System.out.println("A is the largest number");
        
      }
      else{
        System.out.println("C is the largest number");
      }
    

    }else
    {
      if (b>c) {
        System.out.println("B is the largest number");
        
      }
      else{
        System.out.println("C is the largest number");
      }
    }
  
  }
}
  
  
