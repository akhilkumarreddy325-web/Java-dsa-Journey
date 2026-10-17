import java.util.Scanner;
public class str35 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
    int count=0;
    
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
      
        if(ch!=' ' && (i == 0 || n.charAt(i - 1) == ' ')){
            count++;
        }

    }
    System.out.println(count);
}
}