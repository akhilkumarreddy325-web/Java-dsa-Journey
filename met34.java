import java.util.Scanner;
public class met34 {
public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n:");
        int n=sc.nextInt();
        String res=eoo(n);
        System.out.print(res);

    }
    static String eoo(int n){
        if(n%2==0){
            return "even";
        }
        return "odd";
    }


}
