public class sorted_search {
    public static void findkey(int arr[][],int key) {
        int i=0;
        int flag=0;
        int j=arr[0].length-1;
        int cell_value=0;  
        while (i<arr.length&&j>=0){
            cell_value=arr[i][j]; 
            if(key<cell_value){
                j--;
            }
            else if(key>cell_value){
                i++;
            }
            else{
                System.out.println("key found at row " +(i+1)+  " and column at " +(j+1));
                flag=1;
                break;
            }
        }
        if(flag!=1){
            System.out.println("key not found");
        }
        
        
    }
    public static void main(String[] args) {
        int arr[][]={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
        int key=7;
        findkey(arr,key);
      
        
        
    
}
}
