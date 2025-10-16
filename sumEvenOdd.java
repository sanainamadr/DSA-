import java.util.*;
public class sumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice ;
        int sumEven = 0;
        int sumOdd = 0;

        do{
            number =sc.nextInt();

            if(number % 2 ==0 ){
                sumEven += number;
            }
            else{
                sumOdd += number;
            }
            System.out.print("Do you want to continue (1 for yes 0 for no)");
            choice = sc.nextInt();
        }while(choice == 1); 

            System.out.println("sum of even number : "+ sumEven);
            System.out.println("sum of odd number : " + sumOdd);
        

    }
}
