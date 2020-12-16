public class test {
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/n 的值（n 一定
    //是偶数）
    public static void main(String[] args) {
        double result = seriesSum(100);
        System.out.println(result);
    }

    public static double seriesSum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i += 2) {
            sum += calcItem(i);
        }
        return sum;
    }

    public static double calcItem(double i) {
        return 1 / i - 1 / (i+1);
    }

//    //求最大公约数
//    public static void main(String[] args) {
//        int result = calcGreatestCommonDivisor(70, 120);
//        System.out.println(result);
//    }
//
//    public static int calcGreatestCommonDivisor(int m, int n) {
//        int min=Integer.min(m,n);
//        for(int i=min;i>0;i--){
//            if(m%i==0 && n%i==0){
//                return i;
//            }
//        }
//        return 1;
//    }
}
