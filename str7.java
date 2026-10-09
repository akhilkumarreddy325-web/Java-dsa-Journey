import java.util.Scanner;
public class str7 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
    String m=sc.nextLine();
    boolean com=compare(n,m);
    System.out.print(com);

}
static boolean compare(String n,String m){
    return n.equals(m);
}
}