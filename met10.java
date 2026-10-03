import java.util.Scanner;
public class met10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter the value");
    int n=sc.nextInt();
boolean nega=neg(n);
 System.out.println(nega) ;


}
static boolean neg(int n){
    return n<0;
}

}
