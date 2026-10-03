import java.util.Scanner;
public class dsa7 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=0;k<i-1;k++){
                System.out.print(" ");
            }
        
        for(int j=1;j<=2*n-2*i+1;j++){
       System.out.print("*");
        }
        System.out.println();
    }
    
}}
