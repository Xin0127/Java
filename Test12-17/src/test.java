public class test {
    //求出0～999之间的所有水仙花数
    public static void main(String[] args) {
        for (int i = 0; i <= 999; i++) {
            if (isNarcissusNum(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isNarcissusNum(int num) {
        // 1. 取出个位
        int theUnit = num % 10;
        // 2. 取出十位
        int tmp = num / 10;
        int decade = tmp % 10;
        // 3. 取出百位
        tmp = num / 100;
        int hundred = tmp % 10;
        // 4. 判定是不是立方和相等
        if (power3(theUnit) + power3(decade)
                + power3(hundred) == num) {
            return true;
        }
        return false;
    }

    public static int power3(int num) {
        return num * num * num;
    }

//    // 编写程序数一下 1到 100 的所有整数中出现多少个数字9
//    public static void main(String[] args) {
//        int count = calcNineCount();
//        System.out.println(count);
//    }
//
//    public static int calcNineCount() {
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 10 == 9) {
//                count++;
//            }
//            if ((i / 10) % 10 == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
}
