import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i );
        //     i++;
        // }

        // System.out.print("Enter nymber : ");
        // int n = sc.nextInt();
        // int counter =1;
        // while (counter <= n) {
        //     System.out.println(counter);
        //     counter++;
        // }


        // System.out.print("Enter another number : ");
        // int num = sc.nextInt();
        // int sum = 0;
        // int i = 0;

        // while (i<=num){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println(sum);


        // for (int i =0; i < 5; i++){
        //     for(int j=0; j< 5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        // int n = 112233;
        // while (n> 0){
        //     int lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n /= 10;
        // }

        // System.out.println("");
        // int num = 998811;
        // int reverse = 0;

        // while(num >0){
        //     int ld = num%10;
        //     reverse = (reverse * 10) + ld;
        //     num /= 10;

        // }
        // System.out.println(reverse);

        // int n = 112233;
        // while (n > 0){
        //     int reverse1 = n%10;
        //     System.out.print(reverse1);
        //     n /= 10;
        // }
        
        // System.out.println("");
        // int num = 998877;
        // int reverse =0;

        // while(num > 0){
        //     int lastDigit = num % 10;
        //     reverse = (reverse *10) + lastDigit;
        //     num /=10;
        // }
        // System.out.println(reverse);


        // while (true){
        //     System.out.print("enter your number : ");
        //     int number = sc.nextInt();

        //     if (number %10 ==0){
        //         System.out.println("end here");
        //         break;
        //     }
        //     else{
        //     System.out.println(number);}

        // }

        while (true) {
            System.out.print("enter a number : ");
            int digit = sc.nextInt();
            if (digit % 10 == 0){
                continue;
            }
            System.out.println(digit);
            
        }


    }
}
