import java.util.Scanner;

public class opt_sub_array {
    public static void maxsum_subarray(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];

        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==0){
                    curr_sum=prefix[j];

                }
                else{
                    curr_sum=prefix[j]-prefix[i];
                }
                
                if(max_sum<curr_sum){
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println(max_sum);
    }

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int arr[]={2,-2,-3,1,10};
    maxsum_subarray(arr);
    scn.close();
    }
    
}
