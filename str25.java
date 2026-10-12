import java.util.Scanner;
public class str25 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    boolean pal=pal(n);
    System.out.print(pal);
   
}
static boolean pal(String n){
    for(int i=0;i<n.length()/2;i++){
if(n.charAt(i)!=n.charAt(n.length()-1-i)){
   return false;
    }
}
return true;
}
}