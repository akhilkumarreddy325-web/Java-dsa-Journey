import java.util.Scanner;
public class met36 {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter values of n,m:");
        int n=sc.nextInt();
        int count=count(n);
    System.out.print(count);
    }
    static int count(int n){
        int count =0;
        if(n==0){
            return 0;
        }
        while(n!=0){
            int digit=n%10;
               count++;
             n=n/10;
        }
        return count;
    }
}
