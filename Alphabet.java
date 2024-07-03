//program to check whether the character is alphabet or not
public class Alphabet {
  public static void main(String[] args) {
    char c='A';
    if (c>='a' && c<='z'|| (c>='A' && c<='Z')) {
      System.out.println(c+" is an Alphabet ");
      
    }
    else{
      System.out.println(c+" is not an Alphabet");
    }
  }
  
}
