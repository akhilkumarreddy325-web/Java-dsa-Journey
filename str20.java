import java.util.Scanner;
public class str20 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
   
   greet(n);
    //System.out.print("hello"+m);
}
static void greet(String n){
    System.out.print("hello"+n);
}
}
