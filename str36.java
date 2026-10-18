import java.util.Scanner;
public class str36 {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
  String res="";
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        if(ch!=' ' && (i==0||n.charAt(i-1)==' ') ){
          char ch1=Character.toUpperCase(ch);
         res=res+ch1;}
else{
res+=ch;
}}
System.out.println(res);

}}