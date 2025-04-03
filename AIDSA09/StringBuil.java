import java.util.*;
class StringBuil
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String s1=sc.next();
    s1.concat("Hey");
    System.out.println("String after concatenation is "+s1);
    StringBuilder sb = new StringBuilder("Hello");
    sb.append("hi");
    System.out.println("String after appending is "+sb);
  }
}