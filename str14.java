import java.util.Scanner;
public class str14 {
     public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    int count=0;
     n= n.toLowerCase();
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        
      
        if(ch =='a' || ch =='e'|| ch=='i' || ch=='o'|| ch=='u'){
            count++;
        }
    }
System.out.print(count);
}
}