import java.util.Scanner;
public class arr32 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i+=2){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
    for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");}
    }
    }

