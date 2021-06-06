package lesson6;

public class Test{
    private static StringBuffer S1 = new StringBuffer();
    public static void main(String[] args)  {
        S1.append("a");
        S1.append("b");
        S1.append("c");

        StringBuffer s2 = new StringBuffer();
        s2.append("a").append("b").append("c");
    }
}