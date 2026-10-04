import java.util.Scanner;
public class met19 {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println(sum);
}
        static int sum(int n){
            int sum=0;
            if(n==0){
                return 0;
            }
            while(n!=0){
                int digit=n%10;
                
                sum+=digit;
                n=n/10;
            }
            return sum;
        }
}