import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i=0;
        int sum =0;

        int [] a = new int[]{ };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        for ( ;i<=a.length;i++){
            a[i] = Integer.parseInt(str);
            if(a[i]>=a[i+1]){
                sort(a[i],a[i+1]);
            }
            i=i+3;
        }
        sum += a[i+2];
        System.out.println();
    }
    public static void sort(int a,int b ) {
        int tmp;
        tmp=a;
        a=b;
        b=tmp;
    }
}
