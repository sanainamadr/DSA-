import java.util.*;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for(int i =1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }
        // System.out.println("🌸");

        // for (int line=1; line<=4; line++){
        //     for(int star=1; star<=4-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // for (int i =1; i<=9; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }


        // char ch = 'A';
        // for(int i =1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        int n =10;
        for(int i = 1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
                
            }
            System.out.println();
        }

        
    }
}
