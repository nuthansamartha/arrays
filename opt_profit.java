public class opt_profit {
    public static int profit(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            
            else if(max<arr[i]){
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
        int arr[]={4,2,1};
        System.out.println("the profit is: "+profit(arr));
        
    }
    
}

