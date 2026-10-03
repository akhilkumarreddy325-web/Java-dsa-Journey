import java.util.Scanner;
public class met11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two number");
        int n=sc.nextInt();
        int m=sc.nextInt();
        max(n,m);
        int maxi=max(n,m);
        System.out.println(maxi);
    }
    static int max(int n,int m){
        if( n > m){
            return n;
        }
        else{
            return m;
        }
    }
}
