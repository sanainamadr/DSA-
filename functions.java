import java.util.*;

public class functions {
    
    public static int printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return 0 ;
    }

    public static int sumOfNum(int a, int b){
        
        int sum = a + b;
        System.out.println(sum);

        return sum;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        printHelloWorld();
        
        sumOfNum(a,b);

        int num1  = 10;
        int num2 = 5;
        int temp ;
        num1 = num2;
        temp = num1 ;

        System.out.println("num1 =  "+num1);
        System.out.println("num2 =  "+num2);
        

    }
}
