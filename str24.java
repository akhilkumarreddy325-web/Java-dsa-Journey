import java.util.Scanner;
public class str24 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a word: ");
    String n=sc.nextLine();
    int m=count(n);
    System.out.print(m);
}
static int count(String n){
    int count =0;
    for(int i=0;i<n.length();i++){
        char ch=n.charAt(i);
        if(ch=='a'||ch== 'e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
    }
    return count;
}
}
