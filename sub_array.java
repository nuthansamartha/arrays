import java.util.Scanner;

public class sub_array {
    public static void sub(int arr[]){
        int count=0;
        int n=arr.length;
        int sum=0;
        int maxsumm=0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                    sum+=arr[k];
                    
                    
                    
                }
                System.out.println("--->the sum is: "+sum);
                if(maxsumm<sum){
                    int temp=maxsumm;
                    maxsumm=sum;
                    sum=temp;
                }
                count++;
            }
        }
        System.out.println("the maxium subarray sum is: "+maxsumm);
        System.out.println("the number of subarrays: "+count);
      
        
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int arr[]={2,4,6,8,10};
        sub(arr);
        scn.close();

    }
}
