import java.util.Scanner;
public class arr22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
    System.out.print("enter array elements");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
    for(int i=0;i<n;i++){
        if(arr[i]%2==0){
           int a=arr[i];
           System.out.println("first even nnumbr:"+a);
                  break;}
        }
     }
     
}