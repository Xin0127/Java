public class test {
    //输出1000-2000之间所有的闰年
//    public static void main(String[] args) {
//        for(int y = 1000;y <= 2000;y++){
//            if(isLeapYear(y)){
//                System.out.println(y+" 是闰年");
//            }
//        }
//    }
//    public static boolean isLeapYear(int year) {
//        if(year % 100 == 0){
//            if(year % 400 == 0){
//                return true;
//            }else{
//                return false;
//            }
//        }else{
//            if(year % 4 == 0){
//                return true;
//            }else{
//                return false;
//            }
//        }
//    }

    //输出乘法口诀表
    public static void main(String[] args) {
        printMultiplicationTable();
    }

    public static void printMultiplicationTable() {
        for(int i = 1;i <= 9;i++){
            printLine(i);
        }
    }

    public static void printLine(int lineNumber) {
        for(int row = 1;row <= lineNumber;row++){
            System.out.printf("%dx%d=%d ",row,lineNumber,lineNumber*row);
            //注意row和lineNumber的打印顺序
        }
        System.out.println();//无参数，只打印换行
    }
}
