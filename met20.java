import java.util.Scanner;
public class met20 {
public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
        int res=rev(n);
        System.out.println(res);
}
static int rev(int n){
    int rev=0;
    if(n==0){
        return 0;
    }
    while(n!=0){
        int digit=n%10;
      rev= rev*10+digit;
       n=n/10;

    }
    return rev;
}
}