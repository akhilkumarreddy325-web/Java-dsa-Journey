import java.util.Scanner;
public class arr24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
    System.out.print("enter array elements");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int copy[]=new int[n];
     for(int i=0;i<n;i++){
        copy[i]=arr[i];
     }
     for(int i=0;i<n;i++){
     System.out.println("copy array"+copy[i]);}
    }
}
