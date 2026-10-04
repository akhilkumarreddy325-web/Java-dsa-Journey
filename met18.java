import java.util.Scanner;
public class met18 {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
        int count =count(n);
        System.out.println(count);
    }
    static int count(int n){
        int count =0;
        if(n==0){
            return 1;
        }
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
}
