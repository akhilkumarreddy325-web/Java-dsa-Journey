import java.util.Scanner;
public class met21 {
public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
        boolean palindrome=ispalindrome(n);
        System.out.println(palindrome);
}
static boolean ispalindrome(int n){
    int rev=0;
    int or=n;
    while(n>0){
        int digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
    return rev==or;
    
    }
}
