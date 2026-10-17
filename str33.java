import java.util.Scanner;
public class str33 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
    String m=sc.nextLine();
   
     if(n.length()!=m.length()){
            System.out.println(false);
            return;
     }
     boolean is=true;
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        int countn=0;
        int countm=0;
      
    for(int j=0;j<n.length();j++){
        char ch1=n.charAt(j);
 if(ch==ch1){
             countn++;
            }}
        
  for(int l=0;l<m.length();l++){
                char ch3=m.charAt(l);
                 if(ch==ch3){
             countm++;
            }}
            
            
             if(countn!=countm){
           is=false;

            }
            
            }
            System.out.println(is);
        }
        

       
    }
   
        
    

