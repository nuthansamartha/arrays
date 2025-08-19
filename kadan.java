import java.util.Scanner;
public class kadan {
    public static void kadan_sum(int arr[]) {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if (cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }   
        }
        System.out.println(ms);
        System.out.println(Integer.MAX_VALUE);       
        System.out.println(Integer.MIN_VALUE);       
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int arr[]={-1,-2,-7,10,1};
        kadan_sum(arr);
        scn.close();
        
    }
}
