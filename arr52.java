import java.util.Scanner;
public class arr52 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        System.out.print("Enter second array elements");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(arr[i]==arr1[j]){
                System.out.print(arr[i]+" ");
            }}
        }
}
}