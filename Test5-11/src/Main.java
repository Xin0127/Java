import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();//手上总数：10 4
        int count=0;
        for(int i=N;i>=0;i--){//10 4
            int a=i/3;//3 1
            count+=a;//4
            int b=i%3;//取余：1 1
            i=a+b;//剩下的：4 2
            if(i<=2){
                count+=1;
                break;
            }
        }
        System.out.println(count);
    }
}
