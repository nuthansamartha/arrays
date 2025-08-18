import java.util.Scanner;

public class rev {
    public static void array_reverse(int arr[],int num) {
        int j=0;
        int temp=0;
        
        for(int i=0;i<(num/2);i++){
            j=num-i-1;
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;

        }
        System.out.print("the reversed array: ");
        for(int i=0;i<num;i++){
            System.out.print(" "+arr[i]);
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
    array_reverse(arr,num);
    scn.close();
        
    }
}

        
    

