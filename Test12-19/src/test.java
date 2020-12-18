public class test {
    //定义一个计算器类，该类中包含若干个静态方法
    // （方法用来进行两个整形值或者是两个浮点型值的加，减，乘，除运算）。
    public static void main(String[] args) {
//        int i=0,j=0;//错的
        System.out.print("加法：");
//        System.out.println(Calculator.doubleAdd(1.4, 6.6));
//        System.out.println(Calculator.intAdd(14, 2));
        System.out.println(i + "+" + j + "="  + Calculator.doubleAdd(1.4, 6.6));
        System.out.println(i + "+" + j + "="  + Calculator.intAdd(14, 2));
        System.out.print("减法：");
        System.out.println(i + "-" + j + "="  + Calculator.doubleMinus(1.4, 6.6));
        System.out.println(i + "-" + j + "="  + Calculator.intMinus(14, 2));
        System.out.print("乘法：");
//        System.out.println(Calculator.doubleMultiply(1.4, 6.6));
//        System.out.println(Calculator.intMultiply(14, 2));
        System.out.println(i + "*" + j + "="  + Calculator.doubleMultiply(1.4, 6.6));
        System.out.println(i + "*" + j + "="  + Calculator.intMultiply(14, 2));
        System.out.print("除法：");
//        System.out.println(Calculator.doubleDivision(1.4, 6.6));
//        System.out.println(Calculator.intDivision(14, 2));
        System.out.println(i + "/" + j + "="  + Calculator.doubleDivision(1.4, 6.6));
        System.out.println(i + "/" + j + "="  + Calculator.intDivision(14, 2));
    }
}
class Calculator{
    public Calculator() {
    }
    public static double doubleAdd(double i,double j)
    {
        return i + j;
    }
    public static double doubleMinus(double i,double j)
    {
        return i - j;
    }
    public static double doubleMultiply(double i,double j)
    {
        return i * j;
    }
    public static double doubleDivision(double i,double j)
    {
        return i / j;
    }
    public static int intAdd(int i,int j)
    {
        return i + j;
    }
    public static int intMinus(int i,int j)
    {
        return i - j;
    }
    public static int intMultiply(int i,int j)
    {
        return i * j;
    }
    public static int intDivision(int i,int j)
    {
        return i / j;
    }
}
