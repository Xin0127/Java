import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//4
        int M = scanner.nextInt();//24

        int count=0;
        for(int n=N;n<=M;n++){//4
            for(int i=M-N;i>=0;i--){
                if(n%i==0&&i<n){//2
                    n+=i;//6
                    System.out.println(n);//6
                    count++;//1
                }
            }



        //4->(2)6->(2)8->(4)12->18->24 5


        }
        System.out.println(count);
//        for(int i=(M-N)/N;i<=(M-N);i++){
//            //int j=(M-N)/i;
//            if(N%i==0&&(M-N)%i==0){
//
//            }
//        }
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for (int i=n/2;i>=1;i--){
//            if (isPrimeNumber(i)&&isPrimeNumber(n-i)) {
//                System.out.println(i);
//                System.out.println(n-i);
//                break;
//            }
//        }
//    }
//    public static boolean isPrimeNumber(int m) {
//        for (int i = 2; i < m; i++) {
//            if (m % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
