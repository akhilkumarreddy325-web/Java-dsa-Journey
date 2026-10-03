import java.util.Scanner;
public class met12 {
 public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two number");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mini=min(n,m);
        System.out.print(mini);
}
static int min(int n,int m){
if(n>m){
    return m;
}
else{
    return n;
}
}
}