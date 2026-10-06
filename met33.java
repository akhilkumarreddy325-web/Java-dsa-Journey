import java.util.Scanner;
public class met33 {
public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); }
    System.out.print("enter target");
    int target=sc.nextInt();
    int count=count(arr,n,target);
    System.out.print(count);
}
static int count(int arr[],int n,int target){
    int count =0;
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            count++;
        }
    }
    return count;
}
}