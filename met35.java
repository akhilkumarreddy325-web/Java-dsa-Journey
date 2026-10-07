import java.util.Scanner;
public class met35 {
public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter values of n,m:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int res=large(n,m);
        System.out.print(res);
}
static int large(int n,int m){
    if(n>m){
        return n;
    }
    if(m>n){
        return m;
    }
    return 0;
}

}