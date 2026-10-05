import java.util.Scanner;
public class met23 {
public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int power=power(n,m);
        System.out.println(power);
    }
    static int power(int n,int m){
        int res=1;
        for(int i=1;i<=m;i++){
            res*=n;
        }
return res;
    }
}
