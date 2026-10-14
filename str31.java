import java.util.Scanner;
public class str31 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
    int max=0;
        char frequent=' ';
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        int count=0;
        
    for(int j=0;j<n.length();j++){
        char ch1=n.charAt(j);
        if(ch==ch1){
            count++;
           }
        }
        boolean appeared=false;
        for(int k=0;k<i;k++){
            char ch2=n.charAt(k);
            if(ch2==ch){
                 appeared=true;
                //System.out.print("already appeared");
            }
        }
        
if(appeared==false){
    if(count>max){
    max=count;
    frequent=ch;
   
}}

    }
   System.out.println(frequent+"="+max);

}
}