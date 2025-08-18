import java.util.Scanner;

public class rev_array {
    public static void array_reverse(int arr[],int num) {
        int rev[]= new int[num];
        int j=0;
        for(int i=0;i<num;i++){
            j=num-i-1;
            rev[i]=arr[j];

        }
        arr=rev;
        System.out.print("the reversed array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(" ");
            System.out.print(arr[i]);
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
