import java.util.Scanner;
public class arr14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements:");
        //int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter a value");
        int a=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            if(arr[i]==a){
                System.out.println(i);
                break;}
        }
    }
    
}
