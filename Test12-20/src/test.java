import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("是否为整数运算？");
        System.out.println(" [1] 是   [2] 否  ");
        System.out.println("请选择:>");
        int num=scanner.nextInt();
        System.out.println("请输入需要运算的数:>");
        if(num==1){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            System.out.println(n + "+" + m+ "=" + Calculator.intAdd(n,m));
            System.out.println(n + "-" + m+ "=" + Calculator.intSub(n,m));
            System.out.println(n + "*" + m+ "=" + Calculator.intMul(n,m));
            System.out.println(n + "/" + m+ "=" + Calculator.intDiv(n,m));
        }else{
            double i=scanner.nextDouble();
            double j=scanner.nextDouble();
            System.out.println(i + "+" + j+ "=" + Calculator.doubleAdd(i,j));
            System.out.println(i + "-" + j+ "=" + Calculator.doubleSub(i,j));
            System.out.println(i + "*" + j+ "=" + Calculator.doubleMul(i,j));
            System.out.println(i + "/" + j+ "=" + Calculator.doubleDiv(i,j));
        }
    }
}

 class Calculator{
    public Calculator()
    {
    }
    //double型
    public static double doubleAdd(double i,double j) {
        return i + j;
    }
    public static double doubleSub(double i,double j) {
        return i - j;
    }
    public static double doubleMul(double i,double j) {
        return i * j;
    }
    public static double doubleDiv(double i,double j) {
        double tmp=0;
        if(j==0.0){
            System.out.println("分母不能为0");
        }else{
            tmp= i / j;
        }
        return tmp;
    }
    //int型
    public static int intAdd(int n,int m) {
        return n + m;
    }
    public static int intSub(int n,int m) {
        return n - m;
    }
    public static int intMul(int n,int m) {
        return n * m;
    }
    public static int intDiv(int n,int m) {
        int tmp=0;
        if(m==0){
            System.out.println("分母不能为0");
        }else{
            tmp= n / m;
        }
        return tmp;
    }
}
