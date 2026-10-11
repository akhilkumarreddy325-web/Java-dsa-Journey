import java.util.Scanner;
public class str23 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    
    String m=rev(n);
    System.out.print(m);
}
static String rev(String n){
    String res="";
for(int i=n.length()-1;i>=0;i--){
   res+=n.charAt(i);
}
return res;
}}
