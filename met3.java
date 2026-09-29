import java.util.Scanner;
public class met3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("eneter a string name:");
        String name=sc.nextLine();
        greet(name);
    }
    static void greet(String name){
        System.out.print("hello  "+name);
    }
}
