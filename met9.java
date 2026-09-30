import java.util.Scanner;
public class met9 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two values");
        int n=sc.nextInt();
   
        boolean posn=pos(n);
        System.out.print(posn);
     }
     static boolean pos(int n){
        return n>0;
     }
}
