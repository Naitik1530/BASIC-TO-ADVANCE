//program to Count number of digits in an integer
public class CountNumber {
  public static void main(String[] args) {
    int num=5678;
    int count=0;
    while (num!=0) {
      num=num/10;
      count++;

    }
    System.out.println("total number of digits : "+count);
  }
  
}
