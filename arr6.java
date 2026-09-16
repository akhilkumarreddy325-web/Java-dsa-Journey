import java.util.Scanner;
public class arr6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            count++;
        }
    }
     System.out.println("odd numbers: "+count);


    }
}
