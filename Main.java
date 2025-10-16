

public class Main {
    public static void main(String[] args) {

        int n = 567855;
        int rem ;
        int count =0;

        while (n>0) {
            rem = n%10;
            if(rem==5){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
}
}