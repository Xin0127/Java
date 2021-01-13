public class test {
    public static void main(String[] args) {
        int i,j;
        for(i = 1;i<=1000;i++){
            int sum;
            sum =0;
            for(j = 1;j<i;j++)
            {
                if(i%j ==0)
                {
                    sum +=j;
                }
            }
            if(i == sum)
                System.out.println(" "+i);
        }
    }
}
