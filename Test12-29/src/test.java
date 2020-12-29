import java.util.Scanner;

public class test {
    //定义一个类，该类中包含以下几个方法（静态）：
    //实现两个字符串数组的逆序排序，输出结果为字符串数组；
    //求两个整形数组的交集；
    //求两个浮点型数组的并集；
    public static void main(String[] args) {
        turnOver();
        int a1[] = {1,2,3,4,5};
        int a2[] = {4,5,6,7,8};
        double a3[] = {1.1,2.2,3.3,4.4,5.5};
        double a4[] = {6.6,7.7,8.8,9.9};
        Minus(a1, a2);
        System.out.println();
        add(a3, a4);
    }
    public static void turnOver() {
        String result1="";
        String result2= "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入2个字符串：");
        String str1= scanner.nextLine();
        String str2= scanner.nextLine();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        for (int i=charArray1.length-1; i>=0; i--){
            result1 += charArray1[i];
        }
        System.out.println(result1);
        for (int i=charArray2.length-1; i>=0; i--){
            result2 += charArray2[i];
        }
        System.out.println(result2);
    }
    public static void Minus(int[] a,int[] b)
    {
        int[] c = new int[20];
        int k = 0;
        for(int i = 0;i < a.length;i++)
        {
            for(int j = 0;j < b.length;j++)
            {
                if(a[i] == b[j])
                {
                    c[k++] = b[j];
                    break;
                }
            }
        }
        System.out.println("两个整形数组的交集是：");
        for(int i = 0;i < k;i++)
        {
            System.out.print(" " + c[i]);
        }
    }
    public static void add(double[] a,double[] b)
    {
        double[] c = new double[20];
        int k = a.length;
        for(int i = 0; i < a.length;i++)
        {
            c[i] = a[i];
        }
        for(int i = 0;i < b.length;i++)
        {
            int o = 0;
            for(int j = 0;j < k;j++)
            {
                if(b[i] == c[j])
                {
                    o = 1;
                }
            }
            if(o == 0)
            {
                c[k++] = b[i];
            }
        }
        System.out.println("两个浮点型数组的并集是：");
        for(int i = 0;i < k;i++)
        {
            System.out.print(" " + c[i]);
        }
    }
}
