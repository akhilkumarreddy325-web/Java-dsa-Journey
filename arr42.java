import java.util.Scanner;
public class arr42 {

public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
 
    System.out.print("enter array elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        int a=n/2;
       // boolean appear=false;
    for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
         if(arr[i]==arr[j]){
            
             count++;
         }}
         if(count>a){
            System.out.print(arr[i]);
            break;
         }

        }}}