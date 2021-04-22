import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [ ]arr = new int[N];

        int n=N%3;//2
        int count=0;

        for(int i=0;i<=N-1;i++){
            if(i%3!=2){
                if(i<(N-count)){
                    int m=i/3;
                    int tmp=arr[i];
                    arr[i]=arr[i+m];
                    arr[i+m]=tmp;
                }
            }else {
                count+=1;
                if((N-count)==2){
                    System.out.println(arr[2]);
                }
            }
            if(i==N-1){
                i+=n;
            }
        }
    }
}
