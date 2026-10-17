import java.util.Scanner;
public class str34 {

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        int count =0; 
        for(int j=0;j<n.length();j++){
            char ch1=n.charAt(j);
            if(ch==ch1){
                count++;
            }
            
        }
        if(count<2){
            System.out.println(ch);
            break;
        }
        else{
            System.out.println("-1");
            break;
        }
    }
}
}