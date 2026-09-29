import java.util.Scanner;
public class arr53 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
       
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        System.out.print("enter second array values:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
         int arr2[]=new int[n+n];
        for(int i=0;i<n;i++){
          arr2[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr2[n+i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
                    System.out.println(arr2[i] + " ");}
}
}