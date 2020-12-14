public class test {
    //求两个数的最小值
//    public static void main(String[] args) {
//        int result=min(10,20);
//        System.out.println(result);
//    }
//    public static int min(int a,int b) {
//        if(a>b){
//            return b;
//        }else{
//            return a;
//        }
//    }
    //打印1-100之间所有的素数
    public static void main(String[] args) {
        for(int i = 1;i <= 100;i++){
            if(isPrimeNumber(i)){
                System.out.println(i+"是素数");
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if(n == 0||n == 1){
            return false;
        }
        for(int i =2 ;i < n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
