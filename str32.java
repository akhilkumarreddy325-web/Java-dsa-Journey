import java.util.Scanner;
public class str32 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    String res="";
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        
        boolean appear=false;
        for(int j=1;j<res.length();j++){
            char ch1=res.charAt(j);
           if(ch1==ch)
                appear=true;
                
            }
        if(!appear){
            res=res+ch;
        }}
        System.out.println(res);
             
            
                    }
}
