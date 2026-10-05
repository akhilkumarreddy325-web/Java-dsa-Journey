import java.util.Scanner;
public class met24 {
public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
                printarray(arr,n);
        
}
static void printarray(int arr[],int n){
    for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
}
}