import java.util.Scanner;
public class str28 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    String res=space(n);
    System.out.println(res);
}
static String space(String n){
    n=n.replace(" ","");

return n;}
}