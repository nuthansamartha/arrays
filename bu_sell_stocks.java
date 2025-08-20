public class bu_sell_stocks {
    public static int profit(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int start=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(min==arr[i]){
                start=i;
                break;
            }
        }
        for(int i=start;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int profit=max-min;
        if(min<max){
            return profit;
        }
        else{
            return 0;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,6};
        System.out.println("the profit is: "+profit(arr));
        
    }
    
}
