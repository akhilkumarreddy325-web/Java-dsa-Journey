import java.util.Scanner;
public class met26 {
 public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        int small=smallest(arr,n);
        System.out.print(small);
}
static int smallest(int arr[],int n){
    int min=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
}
}