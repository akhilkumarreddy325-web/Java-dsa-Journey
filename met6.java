import java.util.Scanner;
public class met6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two values");
        int n=sc.nextInt();
        int m=sc.nextInt();
        subtract(n,m);
        int result=subtract(n,m);
        System.out.println(result);
    }
    static int subtract(int n,int m){
        return(n-m);
    }
}
