public class starting {
    public static void reverse(int marks[]){
        int start = 0, last = marks.length-1;
        while(start<last){
            int temp = marks[last];
            marks[last] = marks[start];
            marks[start] = temp;

            start ++;
            last --;
        }
    }
    public static void main(String[] args) {
        int marks[] = {2,4,8,10,12,14};
        System.out.println("✨");
        reverse(marks);
        
        
        
        for(int i =0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        
    }
}
