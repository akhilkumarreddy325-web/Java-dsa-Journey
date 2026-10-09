import java.util.Scanner;
public class str9 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    if(n.equals("Java")){
        System.out.print(true);
    }
    else{
        System.out.print("false");
    }
}
}