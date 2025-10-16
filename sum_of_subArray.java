public class sum_of_subArray {

    public static void sumOfSubArray(int number[]){
        int ts = 0;
        for(int i=0; i<number.length; i++){//starting
            for(int j=i; j<number.length; j++){ //ending 
                int sum=0;
                for(int k=i; k<=j; k++){//sum
                    System.out.print(number[k] + " " );
                    sum = sum + number[k];
                    
                }
                ts++;
                System.out.println("the sum of array : "+ sum);
            }
            System.out.println();
        }
        System.out.print("the total number of array : "+ ts);
    }

    public static void kadans(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<number.length; i++){
            cs = cs + number[i];
            if(cs<0){
                cs =0;
            }

            ms = Math.max(cs,ms);

        }
        System.out.println("the max sum of the sub array is : "+ ms);
    }
    public static void main(String[] args) {
        
        int passing[] = {1,2,3,4,5};
        // sumOfSubArray(passing);
        
        // System.out.print("");

        kadans(passing);
    }
}
