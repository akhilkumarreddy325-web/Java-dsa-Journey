import java.util.Scanner;
public class str11 {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    for(int i=0;i<n.length();i++){
         System.out.println(" "+i +" "  +n.charAt(i));
    }
    
}
}