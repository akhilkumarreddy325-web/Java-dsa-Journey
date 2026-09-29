import java.util.Scanner;
public class met4 {
    public static void main(String[] args){

    
    Scanner sc=new Scanner(System.in);
   System.out.print("enetre two integers");
   int n=sc.nextInt();
   int m=sc.nextInt();
   add(n,m);
   int add=add(n,m);
   System.out.println(add);
}
static int add(int n,int m){
    return n+m;
}
}