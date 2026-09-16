import java.util.Scanner;
public class dsa1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
        //System.out.println("enter m :");
        //int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }
             System.out.println();
        }
       

    }
    
}
