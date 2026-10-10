import java.util.Scanner;
public class str15 {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    System.out.print("enter a character: ");
    char m=sc.next().charAt(0);
    int count=0;
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        if(ch==m){
            count++;
        }
    }
    System.out.print(count);
}
}