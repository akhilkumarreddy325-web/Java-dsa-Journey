import java.util.Scanner;
public class arr19{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("enter array elements");
    int count=0;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("enter x value");
    int x=sc.nextInt();
    for(int i=0;i<n;i++){
        if(arr[i]>x){
             count++;
        }
    }
System.out.println(count);
}
}