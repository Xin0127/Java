//定义一个类，该类中包含以下几个方法（静态）：
//实现两个字符串数组的逆序排序，输出结果为字符串数组；
//求两个整形数组的交集；
//求两个浮点型数组的并集；
import java.util.Scanner;
import static java.lang.Float.max;

public class test {
    static void fanxiang(){//逆序输出
        String originalString;
        String resultString = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        originalString = scanner.nextLine();
        char[] charArray = originalString.toCharArray();
        for (int i=charArray.length-1; i>=0; i--){
            resultString += charArray[i];
        }
        System.out.println(resultString);
    }

    static void intersection(){//整数数组交集
        int num1[] = new int[20];
        int num2[] = new int[20];
        int sum[] = new int[20];
        int k=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整型数组：");
        for(int i=0;;i++){
            if(num1[i]=='\13') break;
            num1[i] = scanner.nextInt();
        }
        System.out.println("请输入第二个整型数组：");
        System.out.println(sum);
        for(int i=0;;i++) {
            if(num2[i]=='\13') break;
            num2[i] = scanner.nextInt();
        }
        for(int i=0;i<max(num1.length,num2.length);i++) {
            for(int j=0;;j++){
                if(num1[i]==num2[j]){
                    sum[k] = num1[i];
                    k++;
                }
            }
        }
        System.out.println(sum);
    }
    static void sum_aggregate(){//浮点数数组的并集
        float numa[] = new float[20];
        float numb[] = new float[20];
        float mix[] = new float[20];
        int f=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个浮点型数组：");
        for(int i=0;;i++){
            if(numa[i]=='\13') break;
            numa[i] = scanner.nextFloat();
        }
        System.out.println("请输入第二个浮点型数组：");
        for(int i=0;;i++) {
            if(numb[i]=='\13') break;
            numb[i] = scanner.nextFloat();
        }
        for(int i=0;i<max(numa.length,numb.length);i++) {
            for(int j=0;;j++){
                if(numa[i]!=numb[j]){
                    mix[f] = numa[i];
                    f++;
                }
            }
        }
        System.out.println(mix);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        fanxiang();
        intersection();
        sum_aggregate();
    }

}
