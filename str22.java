import java.util.Scanner;
public class str22 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    char m=first(n);
    System.out.print(m);
}
static char first(String n){
    return n.charAt(0);
}
}

