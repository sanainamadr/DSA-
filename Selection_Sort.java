public class Selection_Sort {
    
    public static void selectionSort(int num[]){
        for(int i=0; i<num.length-1; i++){ // sorted part 
            int minPos = i; // consider that it is smallest number just for initialization
            for(int j=i+1; j<num.length; j++){ // unsorted part 
                if(num[minPos] > num[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp ;
        }
    }

    public static void printArr(int num[]){
        for(int i =0; i<num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = {5,4,1,3,2};

        selectionSort(number);
        printArr(number);
    }
}
