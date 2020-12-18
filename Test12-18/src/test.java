import java.util.Scanner;
public class test {
    //在类中定义一静态个方法根据所输入的某个人的出生年份（整形值）来返回这个人的生肖（字符串类型）。
    public static void main(String[] args) {
        new test();
    }
    public test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出生年份：");
        int birth = scanner.nextInt();
        System.out.print("这个人的生肖是：");
        int twelty=birth%12;
        switch (twelty){
            case 0:
                System.out.println("猴");
                break;
            case 1:
                System.out.println("鸡");
                break;
            case 2:
                System.out.println("狗");
                break;
            case 3:
                System.out.println("猪");
                break;
            case 4:
                System.out.println("鼠");
                break;
            case 5:
                System.out.println("牛");
                break;
            case 6:
                System.out.println("虎");
                break;
            case 7:
                System.out.println("兔");
                break;
            case 8:
                System.out.println("龙");
                break;
            case 9:
                System.out.println("蛇");
                break;
            case 10:
                System.out.println("马");
                break;
            case 11:
                System.out.println("羊");
                break;
        }
    }
//    //在类中定义一个非静态方法，该方法中用while循环输出乘法口诀表。
//    public static void main(String[] args) {
//        new test();
//    }
//    public test(){
//        int i=1,j=1;
//        while(i<=9) {
//            j=1;
//            while(j<=i) {
//                System.out.print(j + "*" + i+ "=" + j * i+" ");
//                j++;
//            }
//            i++;
//            System.out.println();
//        }
//    }
//    //在类中定义一个静态方法printStar,该方法没有返回值，
//    // 需要一个整形参数number,在主方法中调用这个方法
//    public static void main(String[] args){
//        test.printStar(6);
//    }
//
//    public static void printStar(int number){
//        int i;
//        for(i=1;i<=number;i++){//外层循环控制行数
//            if(i==1){//打印第一行的星星
//                for(int j=1;j<number;j++){
//                    System.out.print(" ");
//                }
//                System.out.println("*");
//            } else{
//                for(int j=1;j<2*number-1;j++){
//                    //内层循环控制星星和空格的打印
//                    if(i==number){
//                        for(i=0;i<2*number-1;i++){
//                            System.out.print("*");
//                        }
//                    } else if(j==number-i+1 || j==number+i-1){
//                        System.out.print("*");
//                    } else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
}
