import java.util.Scanner;
public class arr46 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        System.out.print("enter k value");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]);
        }
}
}