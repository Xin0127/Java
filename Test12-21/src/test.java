import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        inputPassword();
}
    public static void inputPassword() {
        String password = "123456";
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        for (; i < 3; i++) {
            System.out.println("请输入密码: ");
            String input = scanner.next();
            if (input.equals(password)) {
                System.out.println("密码正确, 登陆成功");
                break;
            } else {
                System.out.println("密码错误, 请重新输入");
            }
        }
        if (i == 3) {
            System.out.println("您已经连续失败 3 次, 系统强制退出");
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

