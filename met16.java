import java.util.Scanner;
public class met16 {
public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
        printnumbers(n);
       
}
static void printnumbers(int n){
        for(int i=1;i<=n;i++){
               System.out.println(i);  
        }
}
}