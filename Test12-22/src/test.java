import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        while (true) {
            int choice = menu();
            if (choice == 1) {
                // 开始一局游戏
                game();
            } else if (choice == 0) {
                // 结束程序
                System.out.println("goodbye");
                break;
            } else {
                // 输入有误
                System.out.println("您的输入有误!");
                continue;
            }
        }
    }
    public static void game() {
        // 1. 生成一个 1-100 的随机整数
        Random random = new Random();
        int toGuess = random.nextInt(100);
        // 2. 让玩家输入数字进行猜
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要猜的数字: ");
            int num = scanner.nextInt();
            // 3. 进行比较
            if (num < toGuess) {
                System.out.println("低了");
            } else if (num > toGuess) {
                System.out.println("高了 ");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }

    public static int menu() {
        System.out.println("=====================");
        System.out.println(" 1. 开始游戏");
        System.out.println(" 0. 退出游戏");
        System.out.println("=====================");
        System.out.println(" 请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
