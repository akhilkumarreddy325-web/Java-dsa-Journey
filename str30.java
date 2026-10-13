import java.util.Scanner;
public class str30 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two words: ");
    String n=sc.nextLine();
    String[] words=n.split(" ");
    String longest =words[0];
for(int i=0;i<words.length;i++){
        if(words[i].length()>words[0].length()){
            longest=words[i];
        }
        else if (words[i].length()==words[0].length()){
            longest=words[0];
        }
    }
    System.out.print(longest);
}
}