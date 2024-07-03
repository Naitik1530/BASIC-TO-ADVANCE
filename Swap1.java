public class Swap1 {
  public static void main(String[] args) {
    int first=20;
    int Second=30;
    System.out.println("Before Swap");
    System.out.println("First  : "+first);
    System.out.println("Second  : "+Second);
    first=first-Second;
    Second=first+Second;
    first=Second-first;
    System.out.println("After Swap");
    System.out.println("First Number :  "+first);
    System.out.println("Second Number :  "+Second);
  }
  
}
