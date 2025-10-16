import java.util.*;
class Main1 {
    
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int a , int b){
        return a+b;
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }   
    }

    public static void hollow_rectangle(int tot_row,int totl_col){
        for(int i=1; i<=tot_row; i++){
            for (int j =1; j<=totl_col; j++){
                if(i ==1 || i ==tot_row || j==1 || j==totl_col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
    }

    public static void interted_triangle(int n){
        for(int i=1; i<=n; i++){

            //sspace
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //star
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void invertedPyramid(int n ){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsPyramid(int n){
        int counter = 1;
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println( );
        }
    }

    public static void oneZerotriangle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                
                if(( i+j) %2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void rhombus(int n){
        for (int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i =1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //hollow rectangle

            for (int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }

    public static void diamond(int n){
        //1st half
        for (int i =1; i<=n; i++){
            //space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n; i>=1; i--){
             //space
             for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        // System.out.println(sum(5,5));
        // System.out.println(sum(1,4,9));

        // System.out.println(isEven(23));

        // hollow_rectangle(5,6);
        
        // interted_triangle(5);
        // floydsPyramid(5);


        // oneZerotriangle(5);

        // butterfly(5);
        
        // rhombus(4);

        // hollow_rhombus(5);

        diamond(5);

    }
}