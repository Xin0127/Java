public class test {
    public static void main(String[] args) {
        // System.out.println("aaa");
        //System.out.println("ccc");
        //System.out.println("bbb");
        //int num = 10;
        //if (num > 0) {
        //System.out.println("num 是正数");
        //} else if (num < 0) {
        //System.out.println("num 是负数");
        //} else {
        //System.out.println("num 是 0");
        //}
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