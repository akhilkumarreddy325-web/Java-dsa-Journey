import java.util.Scanner;
public class met13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age");
        int n=sc.nextInt();
        //int m=sc.nextInt();
        vote(n);
        String eligible=vote(n);
        System.out.print(eligible);
}
static String vote(int n){
    if(n>18){
        return "eligible";
    }
    else{
        return "not eligible";
    }
}
}