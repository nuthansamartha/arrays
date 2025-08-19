import java.util.Scanner;
public class kadan {
    public static void kadan_sum(int arr[]) {
        int n=arr.length;
        int cs=0;
        int ms=Integer.MIN_VALUE;
        
        
        int flag=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if (cs<0){
                cs=0;
            }
            if(cs>ms){
                ms=cs;
            }
            
        }
        
        if(cs==0){
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){         //unnescary sorting rather that that we use 
                    if(arr[j]>arr[j+1]){          /*maxelement=0;inside for i=1 to n if arr[i]>maxelement, max=arr[i] its 0(n)*/
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;


                    }
                }
                
            }
            System.out.println("the largest element among all the neagtive elements in the array is : "+arr[n-1]);
            flag=1;
        }

        
        
        if(flag!=1){
            System.out.println(ms);

        }
       
          
    }
    public static void main(String[] args) {
        System.out.println("enter the length of the array: ");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int arr[]=new int[num];
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<num;i++){
            arr[i]=scn.nextInt();
        }
        kadan_sum(arr);
        scn.close();
        
    }
}
