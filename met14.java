import java.util.Scanner;
public class met14 {
  public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        boolean divi=div(n);
        System.out.println(divi);
}
static boolean div(int n){
    return n%5==0;
}
}