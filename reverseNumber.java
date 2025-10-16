public class reverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int ans;
        while(num>0){
            ans = num%10;
            System.out.print(ans);  
            num /= 10;
        }
    }
    
    

}
