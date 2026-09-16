import java.util.Scanner;
public class arr21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
    System.out.print("enter array elements");
    
    int avg=0;
    int sum=0;
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
         sum+=arr[i];
      avg = sum/n;
    }
    for(int i=0;i<n;i++){
        if(arr[i]>avg){
            System.out.print(arr[i] +" ");
        }
    }
    
    }
}
