import java.util.Scanner;
public class arr48 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array elements ");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();}
        System.out.print("enter left and right side values fro range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
       while(a<b){
         temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;
         a++;
         b--;

}

for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
}
}