import java.util.Scanner;
public class arr39 {
      public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
   int count=0;
    System.out.print("enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
    boolean came=false;
        
    for(int j=0;j<i;j++){
       if(arr[i]==arr[j]){
            came=true;
            count++;
       }
    }}
 
      }
}