import java.util.*;
public class linearsearch{
    public static void findindex(int arr[],int key){
        int flag=0;
         for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("the array element is at indes of: "+i);
                flag=1;
                break;
            }
        
    }
    if(flag!=1){
        System.out.println("the key entered by the user is not present");
    }



}
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("number of elements in array: ");
    int num=scn.nextInt();
    int arr[]= new int[num];
    System.out.println("enter the key: ");
    int key=scn.nextInt();
  
    System.out.println("enter the array elements: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    findindex(arr,key);
    scn.close();
}

}
