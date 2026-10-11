import java.util.Scanner; 
public class STR18 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
  boolean com=true;
     for(int i=0;i<n.length()/2;i++){
     if (n.charAt(i) == n.charAt(n.length() - 1 - i)) {

   // System.out.println(true);
      } 
else {
    com=false;
    //System.out.println(false);
}
   }
   System.out.print(com);
 
    }
    }

