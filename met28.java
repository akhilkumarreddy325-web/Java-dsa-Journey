import  java.util.Scanner;
public class met28 {
 public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=pos(arr,n);
        System.out.print(count);
}
static int pos(int arr[],int n){
int count=0;
for(int i=0;i<n;i++){
    if(arr[i]>0){
        count++;
    }
}
return count;
}

}