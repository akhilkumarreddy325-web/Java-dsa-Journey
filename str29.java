import java.util.Scanner;
public class str29 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
    String m=sc.nextLine();
    boolean res=same(n,m);
    System.out.println(res);
}
static boolean same(String n,String m){
  return n.equals(m);
}
}