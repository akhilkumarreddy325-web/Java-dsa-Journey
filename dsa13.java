import java.util.Scanner;
public class dsa13 {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n=sc.nextInt();
       
        for(int i=0;i<n;i++){
             char ch='A';
           for(int j=0;j<=i;j++){
            System.out.print(ch+" ");
            ch++;

           }
           System.out.println();
        }
}
}