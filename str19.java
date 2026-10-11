import java.util.Scanner;
public class str19 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    String m="";
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        if(ch ==' '){
           m+='-';
        }
        else{
            m+=ch;
        }
    }
    System.out.print(m);
    
}
}
