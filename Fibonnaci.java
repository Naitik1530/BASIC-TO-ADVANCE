//program to print fibonnaci series using for loop
public class Fibonnaci {
  public static void main(String[] args) {
    int totalterm=6;
    int a=0;
    int b=1;
    for(int i=1;i<=totalterm;i++){
      //System.out.println(i);this will give 1 to 
      System.out.print(a+"  ");
      int sum=a+b;
      a=b;
      b=sum;
    }
  }
  
}
