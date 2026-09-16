import java.util.Scanner;
public class arr12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); }
        System.out.print("enter the value");
        int a=sc.nextInt();
        
        for(int i=0;i<n;i++){
        if(arr[i]==a){
        System.out.print("index:"+i) ;
        }
    }
    
    }
}
