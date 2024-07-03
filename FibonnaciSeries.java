//program to print fibonnaci using while loop
public class FibonnaciSeries {
  public static void main(String[] args) {
    int totalterm=6;
    int a=0;
    int b=1;
    int count=1;
    while (count<=totalterm) {
      System.out.print(a+ "  ");
      int sum=a+b;
      a=b;
      b=sum;
      count++;
      
    }
  }
  
}
