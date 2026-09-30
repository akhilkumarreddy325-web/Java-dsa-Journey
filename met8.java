import java.util.Scanner;
public class met8 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.print("enter a values");
        int n=sc.nextInt();
        even(n);
        boolean even= even(n);
        System.out.println(even);        
}
static boolean even(int n){
    return n % 2 == 0;
}
}
