import java.util.Scanner;
public class arr15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        int sum=0;
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
            sum+=arr[i];
            }
        }
        System.out.println("sum of even numbers:"+sum);
    }
}
