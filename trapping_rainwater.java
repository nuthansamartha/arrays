import java.util.*;
public class trapping_rainwater {
    public static void rainwater_collector(int arr[]) {
       int last,first,wl,storage,total_water=0;
       int leftmax[]=new int[arr.length];
       int rightmax[]=new int[arr.length];
       int n=arr.length;
       first=arr[0];    
       leftmax[0]=first;
       for(int i=1;i<n;i++){
            if(first<arr[i]){
                leftmax[i]=arr[i];
                first=arr[i];
            }
            else{
                leftmax[i]=first;
            }
       }
       last=arr[n-1];
       rightmax[n-1]=last;
       for(int i=n-2;i>=0;i--){
            if(last<arr[i]){
                rightmax[i]=arr[i];
                last=arr[i];
            }
            else{
                rightmax[i]=last;
            }
       }
       for(int i=0;i<n;i++){
            wl=Integer.min(leftmax[i],rightmax[i]);
            storage=wl-arr[i];
            total_water=total_water+storage;
       }
       System.out.println("the total trapped water is: "+total_water);
    }
    public static void main(String[] args) {
        int count1=0;
        int count2=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int num=scn.nextInt();
        int arr[]=new int[num];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<num;i++){
            arr[i]=scn.nextInt();
        }
        
            for (int i=0;i<num-1;i++){
                if(arr[i]<arr[i+1]){
                    count1++;
                }
                else if(arr[i]>arr[i+1]){
                    count2++;
                }
            }
        if(num>2){
            rainwater_collector(arr);
        }
        else if(count1==(num-1)||count2==(num-1)){
            System.out.println("no water is stored as its ascending or descending");
            System.out.println("edre avn amman nemdiyag irbeku");
        }    
        scn.close();
    }
    
}
