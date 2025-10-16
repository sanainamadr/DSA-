public class reverseArrray {
    
    public static void reverce(int numbers[]){
        int first =0, last = numbers.length-1 ;

        while ((first < last)) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++;
            last --;
        }
    }


    public static void printPairs(int number[]){
        int tp =0;
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                System.out.print("("+ number[i]+","+ number[j]+ ")");
                tp ++;
            }
            System.out.println();
        }
        System.out.println("total count = " + tp);
    }


    public static void printSubArray(int numbers[]){
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i ; j<numbers.length; j++){ 
                int sum = 0;
                for(int k = i; k<= j; k++){
                    
                    System.out.print(numbers[k]+ " ");
                    sum = sum + numbers[k];
                }
                System.out.println("sum of sub_array : "+ sum);

                System.out.println();
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        
         int number[] = {2,4,6,8,10};
        // reverce(number);

        // for(int i=0; i<number.length; i++){
        //     System.out.print(number[i]+ " ");
        // }

        printPairs(number);
        printSubArray(number);
    }
}
 