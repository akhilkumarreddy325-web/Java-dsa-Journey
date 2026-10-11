import java.util.Scanner;
public class str21 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    int len=greet(n);
    System.out.print(len);
}
static int greet(String n){
    return n.length();
}
}