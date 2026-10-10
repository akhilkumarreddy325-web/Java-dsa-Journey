import java.util.Scanner;
public class str13 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
     int count=0;
    for(int i=0;i<n.length();i++){
       count++;
    }
    System.out.print(count);

        
    }
}
