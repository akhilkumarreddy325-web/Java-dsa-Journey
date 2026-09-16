import java.util.Scanner;
public class arr36 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("enter array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
   
    System.out.print("enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
     int max=arr[0];
   
    //int max1;
    for(int i=0;i<n;i++){
        if(arr[i]<max){
            max=arr[i];
         }
       }
        int max1=arr[0];
          for(int i=0;i<n;i++){
        if(arr[i]!=max){
            max1=arr[i];
           break;
        }
     }
    
      for(int i=0;i<n;i++){
       if(max<arr[i] && arr[i]<max1){
        
            max1=arr[i];
       
     }}
     System.out.println(max1);
    }
}
