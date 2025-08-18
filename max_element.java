import java.util.Scanner;

public class max_element {
    public static void findmax(int arr[]) {
        int max=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("the largest element in the array is "+max);
        System.out.println("the smallest element in the array is "+small);
        
        
        for(int i=0;i<arr.length;i++){
            if(small==arr[i]){
                System.out.println("the smallest element is at index of :"+i);
            }
            else if(max==arr[i]){
                System.out.println("the largest element is at index of :"+i);

            }
        }

        
    }
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("number of elements in array: ");
    int num=scn.nextInt();
    int arr[]= new int[num];
    System.out.println("enter the array elements: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    findmax(arr);
    scn.close();
    
}
}
