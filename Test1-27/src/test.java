public class test {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 100 == 0){
            // 判定世纪闰年
            if (year % 400 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        } else {
            // 普通闰年
            if (year % 4 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        }
    }
}
