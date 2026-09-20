import java.util.Scanner;
public class arr49 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        System.out.print("Enter target elemenet");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
         
            for(int j=i+1;j<n;j++){
               if(  arr[i]+arr[j]==target){
                System.out.println(arr[i]+","+arr[j]);
                
        }}
    }
    }

}