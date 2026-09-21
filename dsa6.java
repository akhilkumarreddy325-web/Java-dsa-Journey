import java.util.Scanner;
public class dsa6 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n-1;k>=0;k--){
                System.out.print(" ");
            }
        for(int j=1;j<=i;j+=i){
              System.out.print("*");
            }
            System.out.println();
        }
    }
}
