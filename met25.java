import java.util.Scanner;
public class met25 {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
   int large=largest(arr,n);
    System.out.print(large);
}
static int largest(int arr[],int n){
int max=arr[0];
for(int i=0;i<n;i++){
if(arr[i]>max){
    max=arr[i];
}}
return max;
}
}