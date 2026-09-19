import java.util.Scanner;
public class arr45 {
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
        
        for(int i=0;i<=k;i++){
            int temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        for(int j=0;j<n;j++){
        System.out.print(arr[j]);}
}
}