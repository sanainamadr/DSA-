import java.util.*;
public class Buildin_sort {
    
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,1,};
        Arrays.sort(arr);
        printArr(arr);

        System.out.println("👇👇👇👇");
        Array.sort(arr,0,3,Collection.reverseOrder());
        printArr(arr);
    }
}
