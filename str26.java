import java.util.Scanner;
public class str26 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    System.out.print("enter a character:");
    char m=sc.next().charAt(0);
    int res=count(n,m);
    System.out.print(res);
}
static int count(String n,char m){
    int count=0;
for(int i=0;i<n.length();i++){
    char ch=n.charAt(i);
    if(ch==m){
      count++;
    }
    }
    return count;
}
}