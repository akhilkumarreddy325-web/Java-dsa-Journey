import java.util.Scanner;
public class STR38 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    
    String res="";
   int i=0;
   
   while (i<n.length()) {
    char ch=n.charAt(i);
    int count=1;
   
   while(i+1<n.length()&&n.charAt(i)==n.charAt(i+1)){
      
           
            count++;
            i++;
        }
            
            res+=" "+ch+count;
            i++;
   }
           
                    System.out.println(res);
        
        }
    }

