import java.util.Scanner;
public class binarysearch {
    public static void binary(int arr[],int num,int key) {
        int start,end;
        int flag=0;
        start=0;
        end=num-1;
        while (start<=end) {
            int i=0;
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("the key "+ key + "found at"+i);
                flag=1;
                break;
                
            }
            else if(arr[mid]<key){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
            i++;

            
        }
        if(flag!=1){
            System.out.println("key not found in array");
        }
        
    }

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("number of elements in array: ");
    int num=scn.nextInt();
    System.out.println("key in array: ");
    int key=scn.nextInt();
    int arr[]= new int[num];
    System.out.println("enter the array elements: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    binary(arr,num,key);
    scn.close();













}
}
