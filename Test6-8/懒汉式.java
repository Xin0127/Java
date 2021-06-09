package lesson3;

public class 懒汉式 {
    private static 懒汉式 instance;
    private 懒汉式(){}
    public static 懒汉式 getInstance(){
        if(instance == null) instance = new 懒汉式();
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance() == getInstance());
    }
}

