import java.util.Scanner;
public class arr37 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
   
    System.out.print("enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    boolean sorted=true;
 for(int i=0;i<n-1;i++){
        if(arr[i]<arr[i+1]){
            sorted=false;
            break;
        }
     }
     if(sorted){
        System.out.println("array is sorted");
     }
     else{
        System.out.println("array is not sorted");
     }
    }
}
