import java.util.Scanner;
public class met32 {
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
    int last=occur(arr,n,target);
    System.out.print(last);
}
static int occur(int arr[],int n,int target){
    for(int i=n-1;i>0;i--){
     if(arr[i]==target){
return i;
     }
    }
    return -1;
}
}