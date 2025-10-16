import java.util.*;

public class reverce {
    public static void main(String[] args) {
       //calculator 
       Scanner sc = new Scanner(System.in);
       int ans = 0;
       while(true){
        System.out.print("Enter an oprator : ");
        char op = sc.next().trim().charAt(0);
        System.out.println();
        System.out.print("Enter two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (op == '+' || op =='-' || op =='*' ||op =='/' ){
            if (op == '+'){
                ans= num1+num2;
            }
            if (op == '-'){
                ans= num1-num2;
            }
            if (op == '*'){
                ans= num1*num2;
            }
            if (op == '/'){
                if(num2 !=0){
                    ans = num1/num2;
                }
                else{
                    System.out.println("cannot divided by zero");
                }
            }
            System.out.println(ans);

        }
        else if(op=='x' || op=='x'){
            break;
        }
        else{
            System.out.println("Envalid oprator ..... Try again");
        }
 
            
        
        
        

        
       }
       
    }
    
}
