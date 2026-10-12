import java.util.Scanner;
public class str27 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
    String m=sc.nextLine();
    String res=longest(n,m);
    System.out.print(res);
}
static String longest(String n, String m){
    if(n.length()>m.length()){
return n;
    } else if(n.length()<m.length()){
return m;
    }else{
return n;
    }
}
}