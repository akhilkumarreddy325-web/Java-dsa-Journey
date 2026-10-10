import java.util.Scanner;
public class str16 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    System.out.print("enter a character: ");
    char m=sc.next().charAt(0);
  int index=-1;
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        if(ch==m){
            index=i;
break;
        }
      
    }
    System.out.print(index);
}
}