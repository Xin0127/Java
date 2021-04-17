import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int M=scanner.nextInt();
        int N=scanner.nextInt();
        int i=M%N;//0 1
        int m=M-i;//8 6
        for(;m>N-1;m--){
            m=m/N;//4 2
            int n=m%N;//0 0
            m++;//9 5
            String num =Integer.toString(n);
            reverseString(num);
        }
        System.out.print(i);
    }
    public static void reverseString(String str) {
        StringBuffer buffer=new StringBuffer(str);
        System.out.print(buffer.reverse());
    }
}
