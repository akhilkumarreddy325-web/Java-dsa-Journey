import java.util.Scanner;
public class met29 {
 public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=sum(arr,n);
        System.out.print(sum);
 }
 static int sum(int arr[],int n){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    return sum;
 }


}
