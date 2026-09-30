import java.util.Scanner;
public class met7 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.print("enter two values");
        int n=sc.nextInt();
        int m=sc.nextInt();
        mul(n,m);
        int mul=mul(n,m);
    System.out.println(mul);
}
static int mul(int n,int m){
    return(n*m);
}
}
