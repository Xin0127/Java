import java.util.Scanner;

public class test {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个整数:\n");
        int a = scan.nextInt();
        System.out.print("请输入第二个整数:\n");
        int b = scan.nextInt();
        Max_Min(a,b);
    }
    public static void Max_Min(int a,int b){
        int i = a;
        int j = b;
        int x =0,y =0;
        if(a < b){
            x = b;
            b = a;
            a = x;
        }
        while(b != 0){
            y = a % b;
            a = b;
            b = y;
        }
        //最小公倍数
        int t = i * j / a;
        System.out.println(i+"和"+j+"的最大公约数为："+ a);
        System.out.println(i+"和"+j+"的最小公倍数为："+ t);
    }
}
