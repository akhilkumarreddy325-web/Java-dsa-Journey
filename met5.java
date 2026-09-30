import java.util.Scanner;
public class met5 {
public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        System.out.print("enter two values");
        int n=sc.nextInt();
        boolean odd=odd(n);
        System.out.println(odd);
    
}
static boolean odd(int n){
    return n % 2 != 0;
}
}
