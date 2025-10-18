public class Insertion_sort {
    
    public static void insertionSort(int num[]){
        for(int i=1; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;
            
            // findingout the cirrent position to insert
            while (prev >= 0 && num[prev] > curr) {   // to have a desc order array use this 👇👇
               num[prev + 1] = num[prev];             // num[prev] < curr
               prev --;
            }

            //insertion 
            num[prev+ 1] = curr;
        }
    }
    public static void printArr(int num[]){
        for(int i =0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num[] = {5,4,1,3,2};
        insertionSort(num);
        printArr(num);
    }

}
