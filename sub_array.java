import java.util.Scanner;

public class sub_array {
    public static void sub(int arr[]){
        int count=0;
        int n=arr.length;
        int sum=0;
        int sum1[]=new int[100];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                    sum+=arr[k];
                    
                    
                    
                }
                System.out.println("--->the sum is: "+sum);
                count++;
            }
        }
        System.out.println("the number of subarrays: "+count);
        System.out.print("the sum of sub arrays: ");
        
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int arr[]={2,4,6,8,10};
        sub(arr);


    }
}
