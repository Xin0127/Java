import java.util.Random;
import java.util.Scanner;

public class test {
    //猜数字游戏
//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        int toGuess = random.nextInt(100)+1;
//        while(true){
//            System.out.println("请输入要输入的数字：[1,100]");
//            int num = scanner.nextInt();
//            if(num < toGuess){
//                System.out.println("低了");
//            }else if(num > toGuess){
//                System.out.println("高了");
//            }else{
//                System.out.println("猜对了");
//                break;
//            }
//        }
//   }
    //计算1！+2！+3！+4！+5！
    public static void main(String[] args) {
        int s = 0;
        for(int i = 1;i <= 5;i++){
            s += fac(i);
        }
        System.out.println("sum=" +s);
    }
    public static int fac(int n){
        int f = 1;
        for(int i = 1;i <= n; i++){
            f *=i;
        }
        return f;
    }
}
