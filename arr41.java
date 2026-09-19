import java.util.Scanner;
public class arr41 {
 public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
 
    System.out.print("enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
       // boolean appear=false;
    for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
         if(arr[i]==arr[j]){
            
             count++;
         }
         
         
        }
        
        System.out.println(arr[i]+"apperas"+count+"times");
    }

}}
