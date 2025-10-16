import java.util.*;

public class Array {

   public static int linearSearch(int marks[], int key){
      for(int i=0; i<marks.length; i++){
         if(marks[i]==key){
            return i;
         }
      }
      return -1;
   }


   public static int largestInAray(int number[]){
      int largest = Integer.MIN_VALUE;
      int lowest = Integer.MAX_VALUE;
      for(int i=0; i<number.length; i++){
         if(largest < number[i]){
            largest = number[i];
         }
         if(lowest > number[i]){
            lowest = number[i];
         }
      }
      System.out.println("lowest value is " + lowest);
      return largest;
   }

   public static int binarySearch(int numbers[],int key){
      int strat = 0, end = numbers.length-1;

      while (strat<=end) {
         int mid = (strat+end)/2;

         if (numbers[mid] == key) {
            return mid;
         }

         if (numbers[mid]<key){
            strat = mid+1;
         }
         else{
            end = mid - 1;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

      int number[] = {1,2,3,4,5,6,7,8,9,10,77};
      System.out.println("the largest number is "+ largestInAray(number));

      int want = 7;
      System.out.println("found at index " + binarySearch(number, want));




   











      // int marks[] = {23,45,66,77,88,99,33,44};
      // System.out.print("Enter the key : ");
      // int key = sc.nextInt();

      // int index= linearSearch(marks, key);
      // System.out.println(index);

      // if(index == -1){
      //    System.out.println("NOT Found)");
      // }
      // else{
      //    System.out.println("Found at index "+ index);
      // }     
      
   }
}
