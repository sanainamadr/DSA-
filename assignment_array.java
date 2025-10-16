public class assignment_array {
    public static void bubbleSort(int num[]){
        for(int tern= 0; tern<num.length-1; tern++){
            for(int j=0; j<num.length-1-tern; j++){
                if(num[j]>num[j+1]){
                    //swap
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }

    //print the array
    public static void printArr(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = {5,4,1,3,2};
        
        bubbleSort(number);
        printArr(number);
    }
    
}
