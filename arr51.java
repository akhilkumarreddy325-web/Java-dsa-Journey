import java.util.Scanner;
public class arr51 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        int max=arr[0];

    
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 int sum=0;
                for(int k=i;k<=j;k++){
              
               sum+=arr[k];}
               if(max<sum){
                max=sum;
               }
            }
        }
        System.out.print(max);
}}
