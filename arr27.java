import java.util.Scanner;
public class arr27 {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int pos=0;
    System.out.print("enter array elements");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
     for(int i=0;i<n;i++) {
          if(arr[i]!=0){
            arr[pos]=arr[i];
            pos++;
          }
     }
     while(pos<arr.length){
        arr[pos]=0;
        pos++;
     }
     for(int i=0;i<n;i++){
System.out.println(arr[i]);}
    }
}
