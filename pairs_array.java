import java.util.Scanner;

public class pairs_array {
    public static void pair_array(int arr[]) {
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.println(arr[i]+","+arr[j]);
        }

    }
        
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int arr[]={2,4,6,8,10};
        pair_array(arr);
        scn.close();

        
    }
}
