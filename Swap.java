//Swap two Number using third variable
public class Swap {
  public static void main(String[] args) {
    int first=20;
    int Second=30;
    System.out.println("Before Swap :");
    System.out.println("First value : "+first);
    System.out.println("Second value : "+Second);
    int temp=first;//temp is temporary variable
    first=Second;
    Second=temp;
    System.out.println("After Swap :");
    System.out.println("First value : "+first);
    System.out.println("Second value : "+Second);
  }
  
}
