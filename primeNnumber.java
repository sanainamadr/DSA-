import java.util.*;

public class primeNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n==2){
            System.out.println("number is prime ");
        } 
        else {
            boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++ ){
            if(n%i==0){
                isPrime = false;
            }
        }

        if(isPrime == true){
            System.out.println("Number is prime  "+ n);
        }
        else{
            System.out.println("Number is not prime "+ n);
        }
        }
        
    }
}
