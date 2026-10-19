import java.util.Scanner;
public class str37 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
    String m=sc.nextLine();
    String res="";
    
   int i=0;
        
        while(i<n.length()&& i<m.length()&& n.charAt(i)==m.charAt(i)){
       
            res=res+n.charAt(i);
            i++;
        }



        System.out.println(res);
    }
}
