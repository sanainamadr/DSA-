import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        // int a= 12, b = 44;
        // if (a < b){
        //     System.out.println("b is greater" );
        // }
        // else{
        //     System.out.println("a is largest");
        // }


        // if (a %2==0){
        //     System.out.println("a is even");
        // }
        // else{
        //     System.out.println("a is odd ");
        // }

        // tax calculator
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your income : ");
        // int income = sc.nextInt();
        // int tax ;

        // if(income < 500000){
        //     tax = 0;
        // }
        // else if (income >= 500000 && income < 1000000){
        //     tax =  (int )(income * 0.2) ;
        // }
        // else {
        //     tax = (int)(income * 0.3);
        // }

        // System.out.println("Your tax is " + tax);


        // largest among 3 
        // int a = 3, b = 4, c =6;
        // if (a >b && a>c){
        //     System.out.println("a is largest ");
        // }
        // else if( b>c){
        //     System.out.println(" b is largest");
        // }
        // else{
        //     System.out.println("c is the largets ");
        // }


        String num = (33 %2 == 0)? "EVEN" : "ODD" ;
        System.out.println(num);

        System.out.print( "Enter your marks : ");
        int marks = sc.nextInt();
        String result = (marks >= 33)? "PASS" : "FAIL";
        System.out.println(result);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char opp = sc.next().charAt(0);

        switch (opp) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;    
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;    
            default:
                System.out.println("wrong opp");
                break;
        }

    }
}
